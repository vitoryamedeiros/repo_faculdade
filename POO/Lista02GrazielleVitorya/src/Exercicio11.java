public class Exercicio11 {
    public static void main(String[] args) {
        int a=1, b=2, aux;
        System.out.println("Os valores originais são: " + a + " - " + b);

        aux= a;
        a = b;
        b = aux;

        System.out.println("Os valores trocados são: " + a + " - " + b);
    }
}
