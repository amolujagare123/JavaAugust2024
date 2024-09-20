package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo3 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();


        al.add("Imran");
        al.add("leela");
        al.add("pravin");
        al.add("rohini");
        al.add("Kumar");
        al.add("Prasad");
        al.add("Deepali");

        System.out.println(al);

        al.set(2,"yuvaraj");

        System.out.println(al);

      //  al.remove("Kumar");
        al.remove(3);

        System.out.println(al);
    }
}
