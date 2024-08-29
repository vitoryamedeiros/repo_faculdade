package lista01;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade, dias_ano = 365, resultado;
        System.out.println("Digite sua idade: ");
        idade = scanner.nextInt();

        resultado = idade * dias_ano;
        System.out.println("Você tem " + resultado + " dias de vida");
    }
}
