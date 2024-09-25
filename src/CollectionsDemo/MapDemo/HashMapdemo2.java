package CollectionsDemo.MapDemo;

import java.util.HashMap;

public class HashMapdemo2 {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap();

        hm.put(101, "Pratik");
        hm.put(102, "John");
        hm.put(103, "Alice");
        hm.put(104, "Mike");
        hm.put(105, "Sara");


        System.out.println("hm="+hm);

        HashMap<Integer,String> hm2 = new HashMap();

        System.out.println("hm2="+hm2);

        hm2.putAll(hm);

        System.out.println("hm2="+hm2);
    }
}
