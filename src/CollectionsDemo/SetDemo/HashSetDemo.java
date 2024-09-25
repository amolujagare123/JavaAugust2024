package CollectionsDemo.SetDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        hs.add("Imran");
        hs.add("leela");
        hs.add("pravin");
        hs.add("rohini");
        hs.add("Kumar");
        hs.add("Prasad");
        hs.add("Deepali");
        System.out.println(hs.add("Deepali"));

        System.out.println(hs);
    }
}
