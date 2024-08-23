import java.util.Scanner;

public class OperadoresRelacionais {
    public static void main (String args []){
        int num1 = 1, num2 = 7;
        boolean result;

        result = num1 == num2;
        System.out.println("iguais?" + result);

        result = num1 != num2;
        System.out.println("diferentes? " + result);

        result = num1 > num2;
        System.out.println("num1 maior que num2? " + result);

    }
}
