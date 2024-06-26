package application.Empresa_Funcionario.entites;

public class Funcionarios {
    private String nome;
    private String cargo;
    private Double salario;

    public Funcionarios(String nome, String cargo, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Nome: "
               +nome+"\n"
               +"Cargo: "
               +cargo+"\n"
               +"Salário: "
               +String.format("%.2f\n",salario);
    }
}
