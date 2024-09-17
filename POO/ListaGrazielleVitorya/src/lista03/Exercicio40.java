package lista03;
import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.print("Digite o índice de poluição (0,05 a 0,50): ");
            double indicePoluicao = scanner.nextDouble();

            if (indicePoluicao >= 0.05 && indicePoluicao <= 0.25) {
                System.out.println("Índice de poluição aceitável. Nenhuma notificação necessária.");
            } else if (indicePoluicao >= 0.30 && indicePoluicao < 0.40) {
                System.out.println("Notificar as indústrias do 1º grupo para suspenderem suas atividades.");
            } else if (indicePoluicao >= 0.40 && indicePoluicao < 0.50) {
                System.out.println("Notificar as indústrias dos 1º e 2º grupos para suspenderem suas atividades.");
            } else if (indicePoluicao >= 0.50) {
                System.out.println("Notificar todas as indústrias dos 1º, 2º e 3º grupos para suspenderem suas atividades.");
            } else {
                System.out.println("Índice de poluição fora do intervalo esperado.");
            }

            System.out.print("Deseja encerrar o programa? (S para sim / N para não): ");
            String resposta = scanner.next();

            if (resposta.equalsIgnoreCase("S")) {
                continuar = false;
            }
        }

        scanner.close();
        System.out.println("Programa encerrado.");
    }
}
