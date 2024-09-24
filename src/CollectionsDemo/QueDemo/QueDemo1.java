package CollectionsDemo.QueDemo;

import java.util.PriorityQueue;

public class QueDemo1 {

    public static void main(String[] args) {

        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.offer("alok");
        pq.offer("deepali");
        pq.offer("mohan");
        pq.offer("leela");
        pq.offer("bharath");
        pq.offer("saurabh");
        pq.offer("meera");

        // alok ,bharath,  deepali , leela , meera , mohan , saurabh

        System.out.println(pq);


        System.out.println(pq.poll()); // alok
        System.out.println(pq.poll()); // alok
        System.out.println(pq.poll()); // alok
        System.out.println(pq.poll()); // alok
        System.out.println(pq.poll()); // alok
        System.out.println(pq.poll()); // alok
        System.out.println(pq.poll()); // alok

        System.out.println(pq);





    }
}
