package lista03;

public class Exercicio43CORRIGIR {
    public static void main(String[] args) {
        final int NUM_QUADRADOS = 64;
        long totalGraos = 0;
        long graosNoQuadrado = 1;

        for (int i = 1; i <= NUM_QUADRADOS; i++) {
            totalGraos += graosNoQuadrado;
            graosNoQuadrado *= 2;
        }

        System.out.println("Número total de grãos de trigo esperados: " + totalGraos);
    }
}
