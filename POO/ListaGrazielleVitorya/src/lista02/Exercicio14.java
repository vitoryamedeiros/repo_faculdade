package lista02;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, diferenca;

        System.out.println("Digite o primeiro valor: ");
        a = sc.nextInt();

        System.out.println("Digite o segundo valor: ");
        b = sc.nextInt();

        if (a > b) {
            diferenca = a - b;
            System.out.println("A diferença do maior para o menor é: " + diferenca);
        }
        else if (b > a) {
            diferenca = b - a;
            System.out.println("A diferença do maior para o menor é: " + diferenca);
        }
        else {
            System.out.println("Digite um valor válido!");
        }
    }
}
