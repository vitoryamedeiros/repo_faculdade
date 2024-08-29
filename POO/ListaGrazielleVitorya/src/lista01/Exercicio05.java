package lista01;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int km_porLitro = 12, horas, velocidade, distancia, litros_consumidos, total;
        System.out.println("Digite o tempo médio em horas da viagem: ");
        horas = sc.nextInt();

        System.out.println("Digite a velocidade média: ");
        velocidade = sc.nextInt();

        distancia = horas * velocidade;
        litros_consumidos = distancia / 12;

        System.out.println("A velocidade média foi de: " + velocidade);
        System.out.println("O tempo gasto foi de: " + horas);
        System.out.println("A distancia foi de: " + distancia);
        System.out.println("Um total de: " + litros_consumidos + " Litros consumidos");

    }
}
