package lista01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vdd_ID, codigoPeca, pd_quantidade, pd_valor, comissao;

        System.out.println("Digite o ID do vendedor: ");
        vdd_ID = scanner.nextDouble();

        System.out.println("Digite o código da peça: ");
        codigoPeca = scanner.nextDouble();

        System.out.println("Digite a quantidade de peças: ");
        pd_quantidade = scanner.nextDouble();

        System.out.println("Digite o valor da peça: ");
        pd_valor = scanner.nextDouble();

        comissao = (pd_quantidade * pd_valor) * 0.05;
        System.out.println("O valor da sua comissão para essa venda é de : " + comissao + "r$");

    }
}
