package lista03;

import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        do {
            System.out.print("Digite um número menor que 10 e maior que 0: ");
            numero = scanner.nextInt();
        } while (numero <= 0 || numero >= 10);

        int somaQuadrados = 0;
        int count = 0;

        if (numero % 2 == 0) {
            numero++;
        }

        while (count < 20) {
            somaQuadrados += numero * numero;
            numero += 2;
            count++;
        }

        System.out.println("A soma dos quadrados dos 20 primeiros números ímpares é: " + somaQuadrados);

        scanner.close();
    }
}
