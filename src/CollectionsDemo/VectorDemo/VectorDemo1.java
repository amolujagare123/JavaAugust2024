package CollectionsDemo.VectorDemo;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo1 {

    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        System.out.println("size="+v.size()); //0
        System.out.println("capacity="+v.capacity()); // 10

        v.add("Imran");
        v.add("leela");
        v.add("pravin");
        v.add("rohini");
        v.add("Kumar");
        v.add("Prasad");
        v.add("Deepali");
        v.add("Kumar");
        v.add("Prasad");
        v.add("Deepali");
        v.add("Deepali");

        System.out.println("size="+v.size());//7
        System.out.println("capacity="+v.capacity()); // 3

        System.out.println(v);

        System.out.println("Printing using Iterator");

        Iterator itr = v.iterator();

        while (itr.hasNext())
            System.out.println(itr.next());

        System.out.println("Printing using Enumeration");

        Enumeration e = v.elements();
        while(e.hasMoreElements())
            System.out.println(e.nextElement());
    }
}
