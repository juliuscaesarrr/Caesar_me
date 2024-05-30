package Lectures.DSA.Stack_and_queues;
import java.util.Scanner;
public class StackLL {
    public static Node push(Node top){
         Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
        Node temp = new Node(a);
        temp.next=top;
        top = temp;
        return top;
    }
    public static Node pop(Node top){
        if(top==null){
            System.out.println("You list is null");
        }
        System.out.println("Removed item: " + top.data);
        top = top.next;
        return top;
    }
    public static void display(Node top){
        while(top!=null){
            System.out.println(top.data);
            top = top.next;
        }
    }
    public static void main(String[] args) {
        Node top = null;
        top = push(top);
        top = pop(top); // ye top bahar he jis se ye update nhi hoga
        display(top);   //  ...is liye "top = " kia gya h
    }
}
