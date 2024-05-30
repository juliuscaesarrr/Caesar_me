package Lectures.DSA.Stack_and_queues;

import java.util.Scanner;

public class QueueLL {
    public static Node insert (Node rear, Node front){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Node temp = new Node(a);
        rear = temp;
        front = temp;
        System.out.println("Do you want add more node ? yes(1)/no(0)");
        int s = sc.nextInt();
        while(s!=0){
            System.out.println("Enter the element in the node: ");
            a = sc.nextInt();
            Node temp1 = new Node(a);
            rear.next = temp1;
             rear = temp1;
            System.out.println("Do you want add more node ? yes(1)/no(0)");
            s = sc.nextInt();
        }
        return front;
    }
    public static Node delete (Node rear, Node front){
        if(front==null){
            rear = null;
            System.out.println("Your list is empty");
        }
        System.out.println("Removed: " + front.data);
        front = front.next;
        return front;
    }
    public static void display(Node rear, Node front){
        while(front!=null){
            System.out.println(front.data);
            front = front.next;
        }
    }
    public static void main(String[] args) {
     Node rear = null,front = null;
        front=insert(rear,front);
        front=delete(rear,front);
        display(rear,front);
    }
}
