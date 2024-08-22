package Arrays.SingleDimentional;

public class IntArrayDemo2 {

    public static void main(String[] args) {

        int[] a = {23,56,78,90,12,14,90};


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
