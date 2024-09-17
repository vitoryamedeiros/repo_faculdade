package lista03;
import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicializa o maior e o menor número com valores que garantam atualizações
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int numero;

        System.out.println("Digite números para determinar o maior e o menor. Digite 0 para encerrar.");

        while (true) {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();

            // Condição de parada
            if (numero == 0) {
                break;
            }

            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        if (maior == Integer.MIN_VALUE && menor == Integer.MAX_VALUE) {
            System.out.println("Nenhum número válido foi inserido.");
        } else {
            System.out.println("O maior número é: " + maior);
            System.out.println("O menor número é: " + menor);
        }

        scanner.close();
    }
}

