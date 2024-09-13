
//23) Escreva um programa que exiba as opções e realize os que se pede : 1 – Adição, Subtração, Multiplicação e Divisão

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, escolha, resultado;

        System.out.println("Digite o primeiro número para a operação");
        num1 = sc.nextInt();

        System.out.println("Digite o segundo número para a operação");
        num2 = sc.nextInt();

        System.out.println("Escolha uma das opções a seguir: 1- Adição / 2- Subtração / 3- Multiplicação / 4- Divisão");
        escolha = sc.nextInt();

        switch (escolha){
            case 1:
                resultado = num1 + num2;
                System.out.println("O resultado da operação de Adição é: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("O resultado da operação de Subtração é: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("O resultado da operação de Multiplicação é: " + resultado);
                break;
            case 4:
                resultado = num1 / num2;
                System.out.println("O resultado da operação de Divisão é: " + resultado);
                break;
            default:
                System.out.println("Digite um valor válido!");
        }
    }
}
