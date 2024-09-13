
//dois números e informe o valor do maior número e o valor do menor número. Se os dois forem iguais, exibir mensagem informando

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.println("Digite o primeiro valor: ");
        a = sc.nextInt();

        System.out.println("Digite o segundo valor: ");
        b = sc.nextInt();

        if (a > b) {
            System.out.println("O maior número é: " + a);
        }
        else if (b > a) {
            System.out.println("O maior número é: " + b);
        }
        else if (a == b) {
            System.out.println("Os valores são iguais!");
        }
    }
}
