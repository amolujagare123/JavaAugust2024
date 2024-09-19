package WrapperClass;

public class WrapperClassDemo {

    public static void main(String[] args) {

        int i =5;
        System.out.println("i="+i);
        Integer ii1 = new Integer(5);
        Integer ii2 = new Integer(i); // boxing / wrapping
        System.out.println("ii1="+ii1);
        System.out.println("ii2="+ii2);

        Integer ii3 = 5;
        Integer ii4 = i; // auto boxing / auto wrapping

        System.out.println("ii3="+ii3);
        System.out.println("ii4="+ii4);

        Integer ob = new Integer(5);
        int a1 = ob.intValue();
        System.out.println("a1="+a1); // unboxing / unwrapping

        int a2 = ob;
        System.out.println("a2="+a2);// auto-unboxing / auto-unwrapping
    }
}
