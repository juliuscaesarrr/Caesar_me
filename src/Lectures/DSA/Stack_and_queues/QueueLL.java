package Lectures.DSA.Stack_and_queues;

import java.util.Scanner;

public class QueueLL {
    public static Node insert (Node rear, Node front){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Node temp = new Node(a);
        if(rear==null) {
            rear = temp;
            front = temp;
        }
        else{
            rear.next=temp;
            rear=temp;
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
