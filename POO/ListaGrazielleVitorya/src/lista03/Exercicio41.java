package lista03;

import java.util.Scanner;

public class Exercicio41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;

        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();

        if (idade >= 18 && idade <= 150){
            System.out.println("Sua classificacao eh na categoria ADULTO");
        } else if (idade  <= 17 && idade >= 14) {
            System.out.println("Sua classificacao eh na categoria JUVENIL B");
        } else if (idade  == 13 || idade == 12) {
            System.out.println("Sua classificacao eh na categoria JUVENIL A");
        } else if (idade  <= 11 && idade >= 8) {
            System.out.println("Sua classificacao eh na categoria INFANTIL B");
        } else if (idade  <= 7 && idade >= 5) {
            System.out.println("Sua classificacao eh na categoria INFANTIL A");
        }
        else {
            System.out.println("DIGITE UMA IDADE VALIDA!");
        }

    }
}
