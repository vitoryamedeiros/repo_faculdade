import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo;

        System.out.println("Digite um valor: ");
        codigo = sc.nextInt();

        if (codigo == 1 || codigo == 2 || codigo == 3) {
            switch (codigo) {
                case 1:
                    System.out.println("Um");
                    break;
                case 2:
                    System.out.println("Dois");
                    break;
                case 3:
                    System.out.println("Tres");
                break;
            }
        }
        else {
            System.out.println("Digite um código válido!");
        }
    }
}
