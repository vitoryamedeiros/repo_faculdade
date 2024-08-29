package lista01;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double volume, raio = 4, altura = 10;
        volume = 3.14159 * raio *raio * altura;

        System.out.println("O volume da lata é: " + volume);
    }
}
