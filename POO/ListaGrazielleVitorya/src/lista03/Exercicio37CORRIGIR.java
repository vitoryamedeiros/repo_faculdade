package lista03;

import java.util.Scanner;

public class Exercicio37CORRIGIR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcaoEscolhida, valor1, valor2, resultado, retornarNum = 0;

        do {
            System.out.println("\nMenu de Opcoes:\n" +
                    "1 – Adição\n" +
                    "2 – Subtração\n" +
                    "3 – Multiplicação\n" +
                    "4 – Divisão\n")
            ;

            System.out.println("Digite a opcao desejada: (1 - 2 - 3 - 4) ");
            opcaoEscolhida = sc.nextInt();

            System.out.println("Digite um numero: ");
            valor1 = sc.nextInt();

            System.out.println("Digite outro numero: ");
            valor2 = sc.nextInt();

            switch (opcaoEscolhida){
                case 1:
                    resultado = valor1 + valor2;
                    System.out.println("A soma dos dois valores resulta em: " + resultado);
                    break;
                case 2:
                    resultado = valor1 - valor2;
                    System.out.println("A subtração dos dois valores resulta em: " + resultado);
                    break;
                case 3:
                    resultado = valor1 * valor2;
                    System.out.println("A multiplicação dos dois valores resulta em: " + resultado);
                    break;
                case 4:
                    resultado = valor1 / valor2;
                    System.out.println("A divisão dos dois valores resulta em: " + resultado);
                    break;
                default:
                    System.out.println("Digite um valor valido!!");
            }
            System.out.println("Deseja retornar ao menu? ");
            String resposta = sc.next();

            if (resposta == "s" || resposta == "S"){
                retornarNum = 1;
            }
        }
        while (retornarNum == 1);
        // NAO TA REINICIANDO O MENU
    }
}
