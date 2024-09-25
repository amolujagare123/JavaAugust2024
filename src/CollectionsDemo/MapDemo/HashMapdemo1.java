package CollectionsDemo.MapDemo;

import java.util.HashMap;

public class HashMapdemo1 {

    public static void main(String[] args) {

        HashMap hm = new HashMap();

        hm.put(101, "Pratik");
        hm.put(102, "John");
        hm.put(103, "Alice");
        hm.put(104, "Mike");
        hm.put(105, "Sara");

        // Adding 4 heterogeneous elements (Different types)
        hm.put(201, 12345);       // Integer -> Integer
        hm.put("key1", "Value");  // String -> String
        hm.put(303.5, "Price");   // Double -> String
        hm.put(404, true);        // Integer -> Boolean


        System.out.println(hm);
    }
}
