package lista03;
import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 – Conversão de Graus Celsius em Graus Fahrenheit");
            System.out.println("2 – Conversão de Graus Fahrenheit em Graus Celsius");
            System.out.println("3 – Peso ideal do homem");
            System.out.println("4 – Peso ideal da mulher");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a temperatura em graus Celsius: ");
                    double celsius = scanner.nextDouble();
                    double fahrenheit = (celsius * 9/5) + 32;
                    System.out.println(celsius + " graus Celsius é igual a " + fahrenheit + " graus Fahrenheit.");
                    break;

                case 2:
                    System.out.print("Digite a temperatura em graus Fahrenheit: ");
                    fahrenheit = scanner.nextDouble();
                    celsius = (fahrenheit - 32) * 5/9;
                    System.out.println(fahrenheit + " graus Fahrenheit é igual a " + celsius + " graus Celsius.");
                    break;

                case 3:
                    // Cálculo do peso ideal do homem
                    System.out.print("Digite a altura do homem em metros: ");
                    double alturaHomem = scanner.nextDouble();
                    double pesoIdealHomem = (72.7 * alturaHomem) - 58;
                    System.out.print("Digite o peso atual do homem em kg: ");
                    double pesoAtualHomem = scanner.nextDouble();
                    System.out.println("O peso ideal para um homem de " + alturaHomem + " metros é " + pesoIdealHomem + " kg.");
                    if (pesoAtualHomem > pesoIdealHomem) {
                        System.out.println("O usuário está acima do peso ideal.");
                    } else if (pesoAtualHomem < pesoIdealHomem) {
                        System.out.println("O usuário está abaixo do peso ideal.");
                    } else {
                        System.out.println("O usuário está no peso ideal.");
                    }
                    break;

                case 4:
                    // Cálculo do peso ideal da mulher
                    System.out.print("Digite a altura da mulher em metros: ");
                    double alturaMulher = scanner.nextDouble();
                    double pesoIdealMulher = (62.1 * alturaMulher) - 44.7;
                    System.out.print("Digite o peso atual da mulher em kg: ");
                    double pesoAtualMulher = scanner.nextDouble();
                    System.out.println("O peso ideal para uma mulher de " + alturaMulher + " metros é " + pesoIdealMulher + " kg.");
                    if (pesoAtualMulher > pesoIdealMulher) {
                        System.out.println("O usuário está acima do peso ideal.");
                    } else if (pesoAtualMulher < pesoIdealMulher) {
                        System.out.println("O usuário está abaixo do peso ideal.");
                    } else {
                        System.out.println("O usuário está no peso ideal.");
                    }
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
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
