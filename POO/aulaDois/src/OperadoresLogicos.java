public class OperadoresLogicos {
    public static void main (String [] args){
        //OPERADORES UNARIOS
        int total = 10, valor = 15;

        System.out.println("Original:" + valor);
        System.out.println("Prefixado:" + --valor);
        System.out.println("Posfixado:" + valor--);
        System.out.println("Atualizado:" + valor);

        //OPERADORES DE ATRIBUICAO
        total += 15; //(+= , -= , /= , *=)
        System.out.println("Atualizado:" + total);
    }
}
