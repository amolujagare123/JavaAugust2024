package CollectionsDemo.SetDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("Imran");
        lhs.add("leela");
        lhs.add("pravin");
        lhs.add("rohini");
        lhs.add("Kumar");
        lhs.add("Prasad");
        lhs.add("Deepali");
        System.out.println(lhs.add("Deepali"));

        System.out.println(lhs);
    }
}
