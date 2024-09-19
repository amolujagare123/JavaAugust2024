package ExceptionHandling;

public class ArrayDemo {

    public static void main(String[] args) {
        int[] a = new int[5];


        try {
            a[0] = 23;
            a[1] = 45;
            a[2] = 56;
            a[3] = 78;
            a[4] = 71;
            a[5] = 61;
        }
        catch (Exception e)
        {
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
          //  e.printStackTrace();
        }


        int l = a.length;
        System.out.println("length="+l);

        System.out.println("===== Using for loop =======");

        for(int i=0 ; i<a.length ; i++)
            System.out.println(a[i]);
    }
}
