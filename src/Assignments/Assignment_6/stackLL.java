package Assignments.Assignment_6;
import java.util.Scanner;
class Node{
    int data;
    Node next;
}
public class stackLL {
    public static Node push(Node top){
        Scanner sc = new Scanner(System.in);
        Node temp = new Node();
        System.out.println("Enter data: ");
        temp.data = sc.nextInt();
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
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("MENU");
            System.out.println("0: Exit");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Display");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    top = push(top);
                    break;
                case 2:
                    top = pop(top); // ye top bahar he jis se ye update nhi hoga
                    break;
                case 3:
                    display(top);   //  ...is liye "top = " kia gya h                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}