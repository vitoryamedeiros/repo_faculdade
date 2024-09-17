package lista03;

import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int somaPares = 0;
        int somaImpares = 0;

        do {
            System.out.print("Digite um número positivo (ou um número negativo para encerrar): ");
            numero = sc.nextInt();

            if (numero >= 0) {
                if (numero % 2 == 0) {
                    System.out.println(numero + " é par.");
                    somaPares += numero;
                } else {
                    System.out.println(numero + " é ímpar.");
                    somaImpares += numero;
                }
            }

        } while (numero >= 0);

        System.out.println("Soma total dos números pares: " + somaPares);
        System.out.println("Soma total dos números ímpares: " + somaImpares);

        sc.close();
    }
}
