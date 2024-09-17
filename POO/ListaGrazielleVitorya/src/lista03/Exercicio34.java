package lista03;
import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        int numero;

        while (true) {
            System.out.print("Digite um número positivo (ou um número negativo para encerrar): ");
            numero = scanner.nextInt();

            if (numero < 0) {
                break;
            }

            if (numero < menor) {
                menor = numero;
            }
            if (numero > maior) {
                maior = numero;
            }
        }

        if (menor != Integer.MAX_VALUE && maior != Integer.MIN_VALUE) {
            System.out.println("O menor número é: " + menor);
            System.out.println("O maior número é: " + maior);
        } else {
            System.out.println("Nenhum número positivo foi registrado.");
        }

        scanner.close();
    }
}
