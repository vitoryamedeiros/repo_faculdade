package lista01;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp_F, temp_C;
        System.out.println("Digite uma temperatura em Fahrenheit: ");
        temp_F = scanner.nextInt();

        temp_C = temp_F - 32 * 5/9;
        System.out.println("A temperatura em Celsius é: " + temp_C);
    }
}
