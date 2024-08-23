import java.util.Scanner;

public class OperadoresAritmeticos {
    public static void main (String args[]){
        Scanner leia = new Scanner(System.in);
        double num1, num2, soma, subtracao, divisao, multiplicacao, resto;

        System.out.println("Digite dois numeros: ");
        num1 = leia.nextDouble();
        num2 = leia.nextDouble();

        soma = num1 + num2;
        subtracao = num1 - num2;
        divisao = num1 / num2;
        multiplicacao = num1 * num2;
        resto = num1 % num2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtracao: " + subtracao);
        System.out.println("Divisao: " + divisao);
        System.out.println("Multiplicacao: " + multiplicacao);
        System.out.println("Resto: " + resto);

    }

}
