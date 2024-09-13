//leia **quatro notas** e apresente "aprovado" se a média escolar for >= a 7.
// Se o valor da média for <7:
// **solicitar nota de recuperação**,
// **somar com o valor da média**
// e obter a nova média.
// Se a nova média for maior ou igual a 7, informar que foi aprovado na recuperação.
// Se o aluno não foi aprovado, apresentar mensagem informando
// Apresentar junto com as mensagens o valor da média do aluno.

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota1, nota2, nota3, nota4, media, notaRecuperacao;

        System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextInt();

        System.out.println("Digite a segunda nota: ");
        nota2 = sc.nextInt();

        System.out.println("Digite a terceira nota: ");
        nota3 = sc.nextInt();

        System.out.println("Digite a quarta nota: ");
        nota4 = sc.nextInt();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7){
            System.out.println("Você passou direto com média " + media);
        } else if (media < 7) {
            System.out.println("Digite sua nota da recuperação: ");
            notaRecuperacao = sc.nextInt();
            media = (nota1 + nota2 + nota3 + nota4 + notaRecuperacao) / 5;
            if (media < 7){
                System.out.println("Você foi reprovado com média " + media);
            }
            else {
                System.out.println("Você foi aprovado na recuperação com média " + media);
            }
        }
    }
}
