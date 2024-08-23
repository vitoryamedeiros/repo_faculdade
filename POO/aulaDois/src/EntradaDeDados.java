import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String nome;
        int idade;
        double salario;
        boolean existe;

        System.out.println("Digite seu nome: ");
        nome = input.next();

        System.out.println("Digite sua idade: ");
        idade = input.nextInt();

        System.out.println("Digite seu salario: ");
        salario = input.nextDouble();

        System.out.println("Do you exist? ");
        existe = input.nextBoolean();

        input.close();

        System.out.println("Seu nome é " + nome + " e sua idade é " + idade);
        /*
        * --------- METODOS DO SCANNER
        * next ()
        * nextLine()
        * nextDouble()
        * nextInt()
        * nextBoolean()
        * */

    }
}
