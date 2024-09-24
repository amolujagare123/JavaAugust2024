package CollectionsDemo.LinkedListDemo;

import java.util.LinkedList;

public class LinkedListDemo1 {

    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();
        ll.add("Imran");
        ll.add("leela");
        ll.add("pravin");
        ll.add("rohini");
        ll.add("Kumar");
        ll.add("Prasad");
        ll.add("Deepali");
        System.out.println(ll);

        ll.addFirst("first");
        ll.addLast("last");

        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);
    }
}
