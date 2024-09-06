package Methods;

public class MethodsReturningValue {


    int myMethod()
    {
        System.out.println("my method");
        int x = 34;

        return x;
    }

    String reverseString(String myString)
    {
        String rev = "";
        int l = myString.length();

        for (int i=l-1 ; i>=0 ; i--)
        {
            rev = rev + myString.charAt(i);
        }

        return rev;
    }


    int[] getMyArray()
    {
        int[] arr = {12,34,56,78,90,11,24,67};

        return arr;
    }

    String[][] getMyTwoDArray()
    {
        String[][] stArr = {

                {"Amit", "Ravi", "Priya"},
                {"Anjali", "Suresh", "Neha"},
                {"Vikram", "Kiran", "Raj"},
                {"Meera", "Arjun", "Pooja"}

        };

        return stArr;
    }


    public static void main(String[] args) {

        int i1;

        i1 = 10;

        System.out.println(i1);

        int a = i1;

        MethodsReturningValue ob = new MethodsReturningValue();
        System.out.println(ob.myMethod());

        int z = ob.myMethod();
        System.out.println("z="+z);


        String str = "Chandrakala";

        String str2 = ob.reverseString(str);

        System.out.println(str2);

        int[] myArr = ob.getMyArray();

        for (int i=0;i< myArr.length;i++)
        {
            System.out.println(myArr[i]);
        }

        String[][] myStArr = ob.getMyTwoDArray();

        for (int i=0;i< myStArr.length;i++)
        {
            for (int j=0;j<myStArr[0].length;j++)
            {
                System.out.print(myStArr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
