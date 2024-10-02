import java.util.Scanner;

public class Exerc05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um texto: ");
        String txt = sc.nextLine();
        // Remove espaços em branco adicionais
        String textoLimpo = txt.trim().replaceAll("\\s+", " ");
        // Exibe o texto resultante
        System.out.println("Texto sem espaços adicionais: " + textoLimpo);
    }
}
