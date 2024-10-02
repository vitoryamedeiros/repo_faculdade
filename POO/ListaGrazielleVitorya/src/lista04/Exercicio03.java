import java.util.Scanner;

public class exerc03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] conectores = {"e", "do", "da", "dos", "das", "de", "di", "du"};
        System.out.print("Digite o nome completo: ");
        String nomeCompleto = sc.nextLine().toLowerCase();
        String[] p = nomeCompleto.split(" ");
        String iniciais = "";
        for (String palavra : p) {
            if (!ehConector(palavra, conectores)) {
                iniciais += palavra.toUpperCase().charAt(0);
            }
        }
        System.out.println("Iniciais: " + iniciais);
    }
    // Função para verificar se a palavra é um conector
    public static boolean ehConector(String p, String[] conectores) {
        for (String c : conectores) {
            if (p.equals(c)) {
                return true;
            }
        }
        return false;
    }
}