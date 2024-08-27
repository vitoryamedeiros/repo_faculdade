package lista01;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        float cotacao;
        float valor;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a cotação atual do dolár: ");
        cotacao = scanner.nextFloat();
        System.out.print("Digite um valor em doláres: ");
        valor = scanner.nextFloat();

        float conversao = cotacao * valor;
        float resultado = conversao;
        System.out.print("O valor foi convertido de acordo com a cotação informada, e o resultado foi: " + resultado + " reais");

    }
}
