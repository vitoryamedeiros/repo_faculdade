
import java.util.Scanner;

public class exerc04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um texto: ");
        String texto = sc.nextLine();
        int numCaracteres = texto.length();
        String[] palavras = texto.split(" ");
        int numPalavras = palavras.length;
        System.out.println("Número total de caracteres: " + numCaracteres);
        System.out.println("Número total de palavras: " + numPalavras);
    }
}