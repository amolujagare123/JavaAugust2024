package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo4 {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(34);
        al.add(14);
        al.add(33);
        al.add(32);
        al.add(54);
        al.add(31);

        System.out.println(al);

        Integer ii = 32;

        al.remove(ii);
      //  al.remove(new Integer(32));

        System.out.println(al);


    }
}
