package lista01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        String name;
        int codigoPeca;
        int quantidade;
        float valor;

        //fazer o calculo da comissao e printar na tela
        //float comissao = ;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do vendedor: ");
        name = scanner.next();

        System.out.println("Digite o código da peça: ");
        codigoPeca = scanner.nextInt();

        System.out.println("Digite o valor da peça: ");
        valor = scanner.nextFloat();

        System.out.println("Digite a quantidade de peças: ");
        quantidade = scanner.nextInt();

    }
}
