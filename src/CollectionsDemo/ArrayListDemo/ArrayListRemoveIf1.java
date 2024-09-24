package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveIf1 {

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
        // remove all the elements that ends with n
        // -> predicate Symbol
        // variable - predicate Symbol - condition

        al.removeIf(str -> str.endsWith("n"));

        System.out.println("al="+al);

        // remove all the elements that having length less than or equal to 5



    }
}
