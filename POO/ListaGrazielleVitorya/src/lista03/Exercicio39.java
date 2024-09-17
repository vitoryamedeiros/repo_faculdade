package lista03;
import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                System.out.println(numero + " é par.");
            } else {
                System.out.println(numero + " é ímpar.");
            }

            if (numero > 0) {
                System.out.println(numero + " é positivo.");
            } else if (numero < 0) {
                System.out.println(numero + " é negativo.");
            } else {
                System.out.println(numero + " é zero.");
            }

            System.out.print("Deseja encerrar o programa? (S para sim / N para não): ");
            String resposta = scanner.next();

            if (resposta.equalsIgnoreCase("S")) {
                continuar = false;
            }
        }

        scanner.close();
        System.out.println("Programa encerrado.");
    }
}
