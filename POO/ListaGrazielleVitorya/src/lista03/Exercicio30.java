
//30) Faça um programa para imprimir uma tabuada.

package lista03;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        int valorDigitado;
        int multiplicador = 0;
        int total = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        valorDigitado = sc.nextInt();
        System.out.println("A tabuada do número " + valorDigitado + " é: ");

        for (int i = 0; i < 10; i++) {
            total = valorDigitado * ++multiplicador;
            System.out.println(valorDigitado + "x" + multiplicador + " = " + total);
        }
    }
}
