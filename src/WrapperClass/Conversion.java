package WrapperClass;

public class Conversion {

    public static void main(String[] args) {

        String s1 = "12";
        String s2 = "16";
        System.out.println(s1+s2);

        int a1 = Integer.parseInt(s1);
        int a2 = Integer.parseInt(s2);

        System.out.println(a1+a2);

        String s3 = "12.56";
        String s4 = "24.16";

        float f1 = Float.parseFloat(s3);
        float f2 = Float.parseFloat(s4);
        System.out.println(f1+f2);

        double d1 = Double.parseDouble(s3);
        double d2 = Double.parseDouble(s4);
        System.out.println(d1+d2);

        String s5 = "false";

        boolean b = Boolean.parseBoolean(s5);

        if(b==true)
            System.out.println("b is true");
        else
            System.out.println("b is true");

        String s6 = "w";
        char ch = s6.charAt(0);
        System.out.println("ch="+ch);
    }
}
