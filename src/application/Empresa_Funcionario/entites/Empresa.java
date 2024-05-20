package application.Empresa_Funcionario.entites;

import application.Empresa_Funcionario.enums.StatusFuncionario;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nome;
    private String cnpj;

    private StatusFuncionario status;

    private List<Funcionarios> funcionarios = new ArrayList<>();

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public StatusFuncionario getStatus() {
        return status;
    }

    public void setStatus(StatusFuncionario status) {
        this.status = status;
    }

    public List<Funcionarios> getFuncionarios() {
        return funcionarios;
    }

    public void addFuncionario(Funcionarios funcionario) {
        funcionarios.add(funcionario);
    }

    public void removeFuncionario(String nome) {
        for (Funcionarios f : funcionarios) {
            if (f.getNome().equals(nome)) {
                funcionarios.remove(f);
            }
        }
    }

    public String BuscarFuncionario(String nome) {
        StringBuilder sb = new StringBuilder();
        for (Funcionarios f : funcionarios) {
            if (f.getNome().equals(nome)) {
                sb.append(f);
            }
        }
        return sb.toString();
    }

    public double TotalSalario() {
        double soma = 0.0;
        for (Funcionarios f : funcionarios) {
            soma += f.getSalario();
        }
        return soma;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome da empresa: ");
        sb.append(nome+"\n");
        sb.append("CNPJ: ");
        sb.append(cnpj+"\n");
        sb.append("Lista de Funcionários: \n");
        for (Funcionarios f : funcionarios) {
            sb.append(f+"\n");
        }
        return sb.toString();

    }
}
