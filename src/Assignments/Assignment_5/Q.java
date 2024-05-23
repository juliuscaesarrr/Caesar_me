package Assignments.Assignment_5;
import java.util.Scanner;

class Node{
    int regd_no;
    float marks;
    Node next;
    Node prev;
    Node(int regd_no, float marks){
        this.regd_no = regd_no;
        this.marks = marks;
    }
    Node(int regd_no, float marks, Node next, Node prev){
        this.regd_no = regd_no;
        this.marks = marks;
        this.next = next;
        this.prev = prev;
    }
}
public class Q {
      static Node head;
      static Node tail;
      static int size = 0;
    static void create(){
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter regd no: ");
         int k = sc.nextInt();
        System.out.print("Enter marks: ");
         int s = sc.nextInt();
        Node n = new Node(k,s);
         head = n;
         tail = n;
         size++;
        System.out.println("Wants to create more node: (y/n): ");
         char c = sc.next().charAt(0);
        while(c!='n'){
            System.out.print("Enter regd no: ");
             k = sc.nextInt();
            System.out.print("Enter marks: ");
             s = sc.nextInt();
            Node z = new Node(k,s);
            tail.next = z;
            z.prev = tail;
            tail = z;
            size++;
            System.out.println("Wants to create more node: (y/n): ");
             c = sc.next().charAt(0);
        }
    }
    static Node Insbeg(){
      Scanner sc = new Scanner(System.in);
        Node h = head;
        System.out.println("Enter new regd_no: ");
         int k = sc.nextInt();
        System.out.println("Enter new marks: ");
         int s = sc.nextInt();
        Node p = new Node(k,s);
        p.next = head;
        head.prev = p;
        head = p;
        size++;
        if(head==null){
            tail=null;
        }
      return h;
    }
    static Node Insend(){
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter new regd_no: ");
         int k = sc.nextInt();
        System.out.println("Enter new marks: ");
         int s = sc.nextInt();
        Node p = new Node(k,s);
         tail.next = p;
         p.prev = tail;
         tail = p;
         if(tail==null){
             Insbeg();
         }
         size++;
        return head;
    }
    static Node Inany() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter position: ");
        int pos = sc.nextInt();
        Node temp = head;
        if (pos == 1) {
            Insbeg();
        }
        if (pos == size) {
            Insend();
        } else {
            System.out.println("Enter new regd_no: ");
            int k = sc.nextInt();
            System.out.println("Enter new marks: ");
            int s = sc.nextInt();
            Node p = new Node(k, s);
            for (int i = 1; i < pos - 1; i++) {
                temp = temp.next;
            }
            p.next = temp.next;
            temp.next = p;
            p.next.prev = p;
            temp.next.prev = temp;
        }
            return temp;
    }
    static void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println("Regd_no: " + temp.regd_no);
            System.out.println("Marks: " + temp.marks);
             temp = temp.next;
        }
    }

    public static void main(String[] args) {
        create();
        Inany();
        display();
        display();
    }
}
