package Lectures.DSA.Stack_and_queues;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;
public class javaDefined {
    public static void main(String[] args) {
     //Stack
        Stack<Integer> s = new Stack<>();
        s.add(69);
        s.add(29);
        System.out.println(s.pop());
        System.out.println(s.pop());
     //Queues
        Queue<Integer> q = new LinkedList<>();
        q.add(85);
        q.add(55);
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
