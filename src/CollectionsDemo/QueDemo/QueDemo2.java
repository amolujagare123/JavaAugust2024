package CollectionsDemo.QueDemo;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueDemo2 {

    public static void main(String[] args) {

        ArrayDeque<String> adq = new ArrayDeque<>();
        adq.offer("alok");
        adq.offer("deepali");
        adq.offer("mohan");
        adq.offer("leela");
        adq.offer("bharath");
        adq.offer("saurabh");
        adq.offer("meera");

        System.out.println(adq);

        adq.offerFirst("first");
        adq.offerLast("last");

        System.out.println(adq);

        adq.pollFirst();
        adq.pollLast();

        System.out.println(adq);





    }
}
