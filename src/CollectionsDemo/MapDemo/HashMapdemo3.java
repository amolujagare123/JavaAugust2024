package CollectionsDemo.MapDemo;

import java.util.HashMap;

public class HashMapdemo3 {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap();

        System.out.println(hm.isEmpty()); // true

        hm.put(101, "Pratik");
        hm.put(102, "John");
        hm.put(103, "Alice");
        hm.put(104, "Mike");
        hm.put(105, "Sara");

        System.out.println("size="+hm.size());
        System.out.println(hm.isEmpty()); // false
        System.out.println("hm="+hm);

        System.out.println(hm.get(102));

        hm.remove(105);

        System.out.println("hm="+hm);

        System.out.println(hm.containsKey(101));
        System.out.println(hm.containsValue("Alice"));

        hm.clear();
        System.out.println(hm);


    }
}
