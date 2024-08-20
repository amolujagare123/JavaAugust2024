package loops;

public class IncDecDemo2 {

    public static void main(String[] args) {

        int i = 10;
        System.out.println(i); // 10
        System.out.println(i--); // 10
        System.out.println(i); // 9
        System.out.println(--i); // 8
        System.out.println(i); // 8

                  /*  a++ / a - - : here the first statement will execute
                  and then increment or decrement will happen

                ++a/ - - a :   here the first increment or decrement will happen
                & then  statement will execute

*/
    }
}
