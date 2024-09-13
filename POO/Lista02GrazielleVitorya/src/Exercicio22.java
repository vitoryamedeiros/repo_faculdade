import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, a, b;

        System.out.println("Digite um numero: ");
        number = sc.nextInt();

        if (number >= 0){
            a = number;
            System.out.println("O número é positivo e será armazenado em A");
        }
        else if (number < 0){
            b = number;
            System.out.println("O número é negativo e será armazenado em B");
        }
    }
}
