
//35) Faça um programa que conte de 1 até 100 e a cada múltiplo de 10 exiba uma mensagem: "Múltiplo de 10".

package lista03;

public class Exercicio35 {
    public static void main(String[] args) {

        for (int i = 1; i < 100; i++) {
            if (i % 10 == 0) {
                System.out.print("Múltiplo de 10: ");
            }
            System.out.println(i);

        }
    }
}
