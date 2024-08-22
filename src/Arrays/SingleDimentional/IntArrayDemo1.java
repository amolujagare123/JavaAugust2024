package Arrays.SingleDimentional;

public class IntArrayDemo1 {

    public static void main(String[] args) {

        int[] a = new int[5];

        a[0] = 23;
        a[1] = 45;
        a[2] = 56;
        a[3] = 78;
        a[4] = 71;

        int l = a.length;
        System.out.println("length="+l);

        System.out.println("===== Using for loop =======");

        for(int i=0 ; i<a.length ; i++)
          System.out.println(a[i]);

        System.out.println("===== Using for each loop =======");

        for(int x : a)
        {
            System.out.println(x);
        }


    }
}
