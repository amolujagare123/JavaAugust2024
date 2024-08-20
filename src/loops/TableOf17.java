package loops;

public class TableOf17 {

    public static void main(String[] args) {
        // print 1 to 10 number

        int i = 17;

        System.out.println("==== Method 1 =====");

        while (i<=170)
        {
            System.out.println(i);
            i = i + 17 ;
        }

        System.out.println("==== Method 2 =====");

        int j = 1;

        while (j<=10)
        {
            System.out.println(j*17);
            j = j + 1 ;
        }
    }
}
