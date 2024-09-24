package CollectionsDemo.stackDemo;

import java.util.Stack;

public class StackDemo1 {

    public static void main(String[] args) {

        Stack<String> s = new Stack<>();
        s.push("alok");
        s.push("deepali");
        s.push("mohan");
        s.push("leela");
        s.push("bharath");

        System.out.println(s);

        System.out.println(s.pop());
        System.out.println(s);

        System.out.println(s.pop());
        System.out.println(s);
    }
}
