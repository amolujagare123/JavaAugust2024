package ExceptionHandling;

public class ThrowDemo {

    void checkNumber(int i)
    {
        if(i>=1 && i<=10 )
            System.out.println("We are safe");
        else
            throw new ArithmeticException("We are in danger");
    }

    public static void main(String[] args) {

        int a = 7;
        System.out.println("start the program");

        ThrowDemo ob = new ThrowDemo();

        ob.checkNumber(a);

        System.out.println("end of  the program");
    }
}
