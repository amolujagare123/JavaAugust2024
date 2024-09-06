package Methods;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MethodsTakingArguments {

    void methodDemo1(int a)
    {
        System.out.println("Method with single argument");
        System.out.println("a="+a);
    }

    void methodDemo2(int a,int b,int c)
    {
        System.out.println("Method with more than one arguments");
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
    }

    void methodDemo3(int a,double b,char c)
    {
        System.out.println("Method with different types of arguments");
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
    }

    void myArray(int[] arr)
    {
        System.out.println("Below is my array");

        for (int i=0;i<arr.length;i++)
            System.out.print(arr[i]+"\t");

        System.out.println();
    }

    void convertDate(Date date)
    {
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyy");
        System.out.println("DateStr = "+sd.format(date));
    }

    void printTwoDArray(String[][] stArr)
    {
        System.out.println("Below is my 2 D array");

        for(int i=0;i< stArr.length ; i++) {
            for (int j = 0; j < stArr[0].length; j++) {
                System.out.print(stArr[i][j] + "\t");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        MethodsTakingArguments ob = new MethodsTakingArguments();
        ob.methodDemo1(12);
        ob.methodDemo2(12,12,12);
        ob.methodDemo3(12,34.56,'g');

        int[] a = {12,45,23,67,45,67,22,33,56};

        ob.myArray(a);

        String[][] sTwoD = {

                {"Amit", "Ravi", "Priya"},
                {"Anjali", "Suresh", "Neha"},
                {"Vikram", "Kiran", "Raj"},
                {"Meera", "Arjun", "Pooja"}

        };

        ob.printTwoDArray(sTwoD);

        Date date = new Date();

        ob.convertDate(date);


    }
}
