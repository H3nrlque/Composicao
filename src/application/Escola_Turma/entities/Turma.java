package application.Escola_Turma.entities;

import application.Escola_Turma.enums.StatusAluno;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String nome;
    private String materia;
    private StatusAluno status;
    private List<Aluno> alunos = new ArrayList<>();

    public Turma(String nome, String materia) {
        this.nome = nome;
        this.materia = materia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public StatusAluno getStatus() {
        return status;
    }

    public void setStatus(StatusAluno status) {
        this.status = status;
    }

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(String nome) {
        for (Aluno a : alunos) {
            if (a.getNome().equals(nome)) {
                alunos.remove(a);
            }
        }
    }

    public double MediaAluno(int pos) {
        double soma;
        soma = alunos.get(pos).getNota1() + alunos.get(pos).getNota2();
        return soma / 2;
    }

    public double MediaTurma() {
        double soma = 0.0;
        for (Aluno a : alunos) {
            soma += a.getNota1() + a.getNota2();
        }
        return soma / alunos.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Turma: ");
        sb.append(nome+"\n");
        sb.append("Matéria: ");
        sb.append(materia+"\n");
        sb.append("Lista de Alunos:\n");
        for (int i = 0; i < alunos.size(); i++) {
            sb.append(alunos.get(i));
            sb.append("Média do aluno: ");
            sb.append(String.format("%.2f\n",MediaAluno(i)));
            if (MediaAluno(i) >= 7.0) {
                sb.append("Status: ");
                sb.append(StatusAluno.APROVADO);
            } else if (MediaAluno(i) >= 4.0 && MediaAluno(i) < 7.0) {
                sb.append("Status: ");
                sb.append(StatusAluno.RECUPERAÇÃO);
            } else if (MediaAluno(i) < 4.0) {
                sb.append("Status: ");
                sb.append(StatusAluno.REPROVADO+"\n");
            }
            sb.append("\n");
        }
        sb.append("\n");
        sb.append("Média da turma: ");
        sb.append(String.format("%.2f\n",MediaTurma()));
        return sb.toString();
    }
}
