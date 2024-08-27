package StringDemo;

public class CountChraters {

    public static void main(String[] args) {
        String str = "Hey Baby you are so lovely";

        int count = 0;
        for (int i=0 ; i<str.length() ; i++)
        {
            if (str.charAt(i)=='y')
                count++;
        }

        System.out.println("The number of y = "+count);
    }
}
