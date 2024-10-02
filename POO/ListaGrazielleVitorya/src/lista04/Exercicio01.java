import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite alguma coisa: ");

        String algumaCoisa = sc.nextLine();

        int n = algumaCoisa.length();

        String algoM = algumaCoisa.toUpperCase();

        int a = 0, i, v =0, j, dig=0;

        for (i = 0; i < algumaCoisa.length(); i++) {
            if (algumaCoisa.charAt(i) == 'a') {
                a++;
            }
            i++;
        }
        for (j = 0; j < algumaCoisa.length(); j++){
            char ping;
            ping = algumaCoisa.charAt(j);
            switch (ping) {
                case 'a':
                    v++;
                    break;
                case 'e':
                    v++;
                    break;
                case 'i':
                    v++;
                    break;
                case 'o':
                    v++;
                    break;
                case 'u':
                    v++;
                    break;
                default:
                    v = v;
                    break;
            }
            j++;
        }
        boolean uni, rio;
        uni = algumaCoisa.toLowerCase().startsWith("uni");
        if (uni == true) {
            System.out.println("inicia com uni");
        }else {
            System.out.println("não inicia com uni");
        }
        rio = algumaCoisa.toUpperCase().endsWith("rio");
        if (rio == true) {
            System.out.println("termina com rio");
        }else {
            System.out.println("Não termina com rio");
        }
        for (int k = 0; i < algumaCoisa.length(); k++) {
            char c = algo.charAt(i);
            if (Character.isDigit(c)) {
                dig++;
            }
        }
    }
}