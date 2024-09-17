package lista03;

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matricula;
        double nota;
        double somaNotas = 0;
        int numeroAlunos = 0;

        while (true) {
            System.out.print("Digite o número de matrícula do aluno (ou -1 para encerrar): ");
            matricula = sc.nextInt();

            if (matricula == -1) {
                break;
            }

            System.out.print("Digite a nota do aluno: ");
            nota = sc.nextDouble();

            somaNotas += nota;
            numeroAlunos++;
        }

        if (numeroAlunos > 0) {
            double media = somaNotas / numeroAlunos;
            System.out.println("A média das notas dos alunos é: " + media);
        } else {
            System.out.println("Nenhuma nota foi registrada.");
        }

        sc.close();
    }
}
