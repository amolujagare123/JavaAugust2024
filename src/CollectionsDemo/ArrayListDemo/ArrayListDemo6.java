package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo6 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();


        al.add("Imran");
        al.add("leela");
        al.add("pravin");
        al.add("rohini");
        al.add("Kumar");
        al.add("Prasad");
        al.add("Deepali");

        System.out.println("al="+al);

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("leela");
        al2.add("pravin");
        al2.add("rohini");
        al2.add("Kumar");
        al2.add("ashwini");
        al2.add("veena");
        al2.add("Kunal");
        System.out.println("al2="+al2);
        al2.removeAll(al);
        System.out.println("al2="+al2);

    }
}
