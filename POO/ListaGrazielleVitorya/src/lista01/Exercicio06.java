package lista01;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp_F, temp_C;
        System.out.println("Digite uma temperatura em Celsius: ");
        temp_C = scanner.nextInt();

        temp_F = 9 * temp_C + 160 / 5;
        System.out.println("A temperatura em Fahrenheit é: " + temp_F);
    }
}
