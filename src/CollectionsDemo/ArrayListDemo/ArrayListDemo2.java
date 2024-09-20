package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        System.out.println("size="+al.size());
        System.out.println("isEmpty="+al.isEmpty());// true

        al.add("Imran");
        al.add("leela");
        al.add("pravin");
        al.add("rohini");
        al.add("Kumar");
        al.add("Prasad");
        al.add("Deepali");
        System.out.println("isEmpty="+al.isEmpty()); //false

        System.out.println("size="+al.size()); // 7

        System.out.println(al.get(3));

        System.out.println(al);

        System.out.println("Printing using for loop");
        for (int i = 0; i<al.size() ;i++)
            System.out.println(al.get(i));

        System.out.println("Printing using for each loop");

        for(String s:al)
        {
            System.out.println(s);
        }

        System.out.println("Printing using Iterator");

        Iterator itr = al.iterator();

        while (itr.hasNext())
            System.out.println(itr.next());

        System.out.println("al="+al);
        al.clear();
        System.out.println("al="+al);

        System.out.println("isEmpty="+al.isEmpty());

    }
}
