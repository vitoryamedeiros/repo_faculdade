import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor;

        System.out.println("Digite um valor: ");
        valor = sc.nextInt();

        if (valor >= 0 && valor <= 9) {
            System.out.println("Valor válido");
        }
        else {
            System.out.println("Digite um valor válido!");
        }
    }
}
