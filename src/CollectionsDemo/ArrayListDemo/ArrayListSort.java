package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListSort {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();



        al.add("Imran");
        al.add("Leela");
        al.add("Pravin");
        al.add("Rohini");
        al.add("Kumar");
        al.add("Prasad");
        al.add("Deepali");
        System.out.println(al);

        Collections.sort(al);

        System.out.println(al);



    }
}
