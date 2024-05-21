package application.Pedido_Cliente.entities;

public class Client {
    private String nome;
    private String email;
    private String cpf;

    public Client(String nome, String email, String cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Name: "
               +nome+"\n"
               +"CPF: "
               +cpf+"\n"
               +"Email: "+email+"\n";
    }
}
