package Lectures.DSA.LinkedLIST;
import java.util.Scanner;
public class doublyLList{
    static Node head;
    static Node tail;
    static int size = 0;
    static void create(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data: ");
             int d = sc.nextInt();
          Node temp = new Node(d);
           temp.next = null;
           temp.prev = null;
           head = temp;
           tail = temp;
        System.out.println("Do you want to create more node(y/n): ");
         char s = sc.next().charAt(0);
         while(s!='n'){
             System.out.println("Enter data: ");
              d = sc.nextInt();
             Node temp1 = new Node(d);
             tail.next = temp1;
             temp1.prev = tail ;
             tail = temp1;
             System.out.println("Do you want to create more node(y/n): ");
             s = sc.next().charAt(0);
         }
    }
       static void display(){
        Node k = tail;
        while(k!=null){
            System.out.println(k.data);
            k = k.prev;
        }
       }
    public static void main(String[] args) {
       create();
       display();
    }
}