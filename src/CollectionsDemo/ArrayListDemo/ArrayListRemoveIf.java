package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveIf {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(37);
        al.add(14);
        al.add(33);
        al.add(32);
        al.add(54);
        al.add(31);

        System.out.println(al);

        // remove the odd numbers

       al.removeIf(i -> i%2!=0);
   //     al.removeIf(i -> !(i%2==0));

        System.out.println(al);




    }
}
