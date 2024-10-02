import java.util.Scanner;

public class Exerc02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();
        if (numero < 0) {
            numero = Math.abs(numero);
            System.out.print("Menos ");
        }
        imprimirDigitosPorExtenso(numero);
    }
    public static void imprimirDigitosPorExtenso(int numero) {
        // função para converter numero em estensso;
        String numeroString = Integer.toString(numero);
        for (int i = 0; i < numeroString.length(); i++) {
            char digito = numeroString.charAt(i);
            switch (digito) {
                case '0':
                    System.out.print("Zero ");
                    break;
                case '1':
                    System.out.print("Um ");
                    break;
                case '2':
                    System.out.print("Dois ");
                    break;
                case '3':
                    System.out.print("Três ");
                    break;
                case '4':
                    System.out.print("Quatro ");
                    break;
                case '5':
                    System.out.print("Cinco ");
                    break;
                case '6':
                    System.out.print("Seis ");
                    break;
                case '7':
                    System.out.print("Sete ");
                    break;
                case '8':
                    System.out.print("Oito ");
                    break;
                case '9':
                    System.out.print("Nove ");
                    break;
            }
        }
    }
}