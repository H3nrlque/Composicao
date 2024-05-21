package application.Escola_Turma.entities;

public class Aluno {
    private String nome;
    private Integer matricula;
    private Double nota1;
    private Double nota2;

    public Aluno(String nome, Integer matricula, Double nota1, Double nota2) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: ");
        sb.append(nome+"\n");
        sb.append("Mátricula: ");
        sb.append(matricula+"\n");
        return sb.toString();
    }
}
