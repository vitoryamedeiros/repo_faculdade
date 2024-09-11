package lista02;

public class Exercicio12 {
    public static void main(String[] args) {
        int x = 10, modulo;

        if (x >= 0){
            modulo = x;
            System.out.println("O módulo de " + x + " é " + "|" + modulo + "|");
        } else if (x < 0) {
            modulo = x * (-1);
            System.out.println("O módulo de " + x + " é " + "|" + modulo + "|");
        }
        else {
            System.out.println("Digite um valor válido!");
        }
    }
}
