package Arrays.SingleDimentional;

public class CharArrayDemo {
    public static void main(String[] args) {

        char[] ch = new char[5];

        ch[0] = 'a';
        ch[1] = 'b';
        ch[2] = 'c';
        ch[3] = 'c';
        ch[4] = 'c';

        System.out.println("===== Using for loop =======");

        for (int i=0;i<ch.length;i++)
            System.out.println(ch[i]);

        System.out.println("===== Using for each loop =======");

    }
}
