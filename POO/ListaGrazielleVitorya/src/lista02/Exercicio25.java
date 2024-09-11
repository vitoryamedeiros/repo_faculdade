package lista02;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float altura;
        char genero;

        System.out.println("Digite sua altura: (ex: 1,65) ");
        altura = sc.nextFloat();

        double pesoM = (72.7 * altura) - 58;
        double pesoF = (62.1 * altura) - 44.7;

        System.out.println("Digite seu gênero (M/F): ");
        genero = sc.next().toUpperCase().charAt(0);

        switch(genero){
            case 'M':
                System.out.println("Seu peso ideal é " + pesoM);
                break;
            case 'F':
                System.out.println("Seu peso ideal é " + pesoF);
                break;
            default:
                System.out.println("Indefinido");
                break;
        }

    }
}
