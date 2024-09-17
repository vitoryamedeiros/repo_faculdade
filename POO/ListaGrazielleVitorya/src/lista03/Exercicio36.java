package lista03;
import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidade = 10;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int soma = 0;
        int numero;

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor inteiro e positivo: ");
            numero = scanner.nextInt();

            if (numero <= 0) {
                System.out.println("O valor deve ser um número inteiro e positivo. Tente novamente.");
                i--;
                continue;
            }

            if (numero < menor) {
                menor = numero;
            }
            if (numero > maior) {
                maior = numero;
            }

            soma += numero;
        }

        double media = soma / (double) quantidade;

        System.out.println("O menor valor é: " + menor);
        System.out.println("O maior valor é: " + maior);
        System.out.println("A média dos valores é: " + media);

        scanner.close();
    }
}
