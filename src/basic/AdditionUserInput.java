package basic;

import java.util.Scanner;

public class AdditionUserInput {

    public static void main(String[] args) {

        int a ;
        double b ;
        double c ;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of a :");
        a = sc.nextInt();

        System.out.println("Enter value of b :");
        b = sc.nextDouble();

        c = a + b;

        System.out.println("Addition=" + c);
    }
}
