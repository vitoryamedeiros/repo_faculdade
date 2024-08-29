package lista01;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int var_a,var_b,var_c,var_d, res_ab, res_ac, res_ad,res_bc, res_bd, res_cd;

        System.out.println("Digite o primeiro valor: ");
        var_a = scanner.nextInt();
        System.out.println("Digite o segundo valor: ");
        var_b = scanner.nextInt();
        System.out.println("Digite o terceiro valor: ");
        var_c = scanner.nextInt();
        System.out.println("Digite o quarto valor: ");
        var_d = scanner.nextInt();

        res_ab = var_a + var_b;
        res_ac = var_a + var_c;
        res_ad = var_a + var_d;
        res_bc = var_b + var_c;
        res_bd = var_b + var_d;
        res_cd = var_c + var_d;
        System.out.println("Resultados soma: AB: " + res_ab + " - AC: " + res_ac + " - AD: " + res_ad + " - BC: " + res_bc + " - BD: " + res_bd + " - CD: " + res_cd);

        res_ab = var_a * var_b;
        res_ac = var_a * var_c;
        res_ad = var_a * var_d;
        res_bc = var_b * var_c;
        res_bd = var_b * var_d;
        res_cd = var_c * var_d;
        System.out.println("Resultados da Multiplicação: AB: " + res_ab + " AC: " + res_ac + " - AD: " + res_ad + " - BC: " + res_bc + " - BD: " + res_bd + " - CD: " + res_cd);

    }
}
