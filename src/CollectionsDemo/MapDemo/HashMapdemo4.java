package CollectionsDemo.MapDemo;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class HashMapdemo4 {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap();


        hm.put(101, "Pratik");
        hm.put(102, "John");
        hm.put(103, "Alice");
        hm.put(104, "Mike");
        hm.put(105, "Sara");

        System.out.println(hm);

        Set key = hm.keySet();
        System.out.println("keys="+key);

        Collection values = hm.values();
        System.out.println("values="+values);


        Set entrySet = hm.entrySet();
        System.out.println("entrySet="+entrySet);


    }
}
