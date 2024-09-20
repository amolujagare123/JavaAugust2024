package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo5 {

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

        System.out.println("al2="+al2);

        al2.addAll(al);

        System.out.println("al2="+al2);
    }
}
