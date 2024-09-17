package lista03;
import java.util.Scanner;

public class Exercicio38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.print("Digite o código do operário: ");
            int codigo = scanner.nextInt();
            System.out.print("Digite o número de horas trabalhadas: ");
            int horasTrabalhadas = scanner.nextInt();

            final double valorHoraNormal = 10.00;
            final double valorHoraExtra = 20.00;
            final int limiteHoras = 50;

            double salarioTotal;
            double salarioExcedente = 0;

            if (horasTrabalhadas > limiteHoras) {
                int horasExtras = horasTrabalhadas - limiteHoras;
                salarioTotal = (limiteHoras * valorHoraNormal) + (horasExtras * valorHoraExtra);
                salarioExcedente = horasExtras * valorHoraExtra;
            } else {
                salarioTotal = horasTrabalhadas * valorHoraNormal;
            }

            System.out.println("Salário total: R$ " + String.format("%.2f", salarioTotal));
            System.out.println("Salário excedente: R$ " + String.format("%.2f", salarioExcedente));

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
