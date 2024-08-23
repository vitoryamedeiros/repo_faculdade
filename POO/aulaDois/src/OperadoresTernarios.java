import java.util.Scanner;

public class OperadoresTernarios {
    //@Override
    public static void main(String args []) {
        Scanner digite = new Scanner(System.in);
        double mediaFinal;
        String situacao;

        System.out.println("Digite a media do alune: ");
        mediaFinal = digite.nextDouble();

        situacao = mediaFinal >= 7.0? "Aprovade" : "Desaprovade";
        System.out.println("O alune foi " + situacao);

    }
}
