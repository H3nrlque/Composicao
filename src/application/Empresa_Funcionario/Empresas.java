package application.Empresa_Funcionario;

import application.Empresa_Funcionario.entites.Empresa;
import application.Empresa_Funcionario.entites.Funcionarios;
import application.Empresa_Funcionario.enums.StatusFuncionario;

import java.util.Scanner;

public class Empresas {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Nome da Empresa: ");
        String nomeEmpresa = tc.nextLine();
        System.out.print("CNPJ: ");
        String cnpjEmpresa = tc.next();
        Empresa empresa = new Empresa(nomeEmpresa, cnpjEmpresa);
        System.out.println(StatusFuncionario.Empresa_Criada);
        System.out.println();
        int opcao;
        do {
            System.out.println(Escolha());
            opcao = tc.nextInt();
            if (opcao == 1) {
                tc.nextLine();
                System.out.print("Nome do funcionário: ");
                String nomeFuncionario = tc.nextLine();
                System.out.print("Cargo: ");
                String cargoFuncionario = tc.nextLine();
                System.out.print("Salário: R$");
                double salarioFuncionario = tc.nextDouble();
                Funcionarios funcionario = new Funcionarios(nomeFuncionario, cargoFuncionario, salarioFuncionario);
                empresa.addFuncionario(funcionario);
                System.out.println(StatusFuncionario.Funcionario_Contratado);
                System.out.println();
            } else if (opcao == 2) {
                tc.nextLine();
                System.out.print("Nome do Funcionário: ");
                String nomeFuncionario = tc.nextLine();
                empresa.removeFuncionario(nomeFuncionario);
                System.out.println(StatusFuncionario.Funcionario_Demitido);
            } else if (opcao == 3) {
                tc.nextLine();
                System.out.print("Nome do funcionário: ");
                String nomeFuncionario = tc.nextLine();
                String funcionario = empresa.BuscarFuncionario(nomeFuncionario);
                if (funcionario != null) {
                    System.out.println(StatusFuncionario.Funcionario_Encontrado);
                    System.out.println(funcionario);
                } else {
                    System.out.println(StatusFuncionario.Funcionario_Nao_Encontrado);
                }
                System.out.println();
            } else if (opcao == 4) {
                System.out.println(empresa);
            } else if (opcao == 5) {
                System.out.println("Saindo..");
            }
        } while (opcao != 5);
    }

    public static String Escolha() {
        StringBuilder sb = new StringBuilder();
        sb.append("Escolha uma opção: \n");
        sb.append("[1] Adicionar funcionário\n");
        sb.append("[2] Remover funcionário\n");
        sb.append("[3] Procurar funcionário\n");
        sb.append("[4] Ver lista de funcionários\n");
        sb.append("[5] Sair\n");
        return sb.toString();
    }
}
