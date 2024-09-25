package CollectionsDemo.SetDemo;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {
        TreeSet<String> lhs = new TreeSet<>();

        lhs.add("Imran");
        lhs.add("Leela");
        lhs.add("Pravin");
        lhs.add("Rohini");
        lhs.add("Kumar");
        lhs.add("Prasad");
        lhs.add("Deepali");
        System.out.println(lhs.add("Deepali"));

        System.out.println(lhs);
    }
}
