package application.Escola_Turma;

import application.Escola_Turma.entities.Aluno;
import application.Escola_Turma.entities.Turma;

import java.util.Scanner;

public class Escola {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Turma: ");
        String nomeTurma = tc.nextLine();
        System.out.print("Matéria: ");
        String nomeMateria = tc.nextLine();
        Turma turma = new Turma(nomeTurma, nomeMateria);
        System.out.print("Quantos alunos serão adicionados: ");
        int n = tc.nextInt();
        for (int i = 0; i < n; i++) {
            tc.nextLine();
            System.out.println("Aluno #"+(i+1));
            System.out.print("Nome: ");
            String nomeAluno = tc.nextLine();
            System.out.print("Número de mátricula: ");
            int numeroMatricula = tc.nextInt();
            System.out.print("Nota 1: ");
            double nota1 = tc.nextDouble();
            System.out.print("Nota 2: ");
            double nota2 = tc.nextDouble();
            Aluno aluno = new Aluno(nomeAluno, numeroMatricula, nota1, nota2);
            turma.addAluno(aluno);
            System.out.println();
        }
        tc.nextLine();
        System.out.println();
        System.out.println(turma);
        System.out.println();
        System.out.print("Digite o nome do aluno que você quer remover: ");
        String nome = tc.nextLine();
        turma.removerAluno(nome);
        System.out.println();
        System.out.println(turma);
    }
}
