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
         tail.next = null;
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
            tail.next = null;
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
            size++;
            return temp;
        }
        return head;
    }
    static Node Delbeg(){
        Node h = head;
        h = h.next;
        head = h;
        h.prev = null;
        if(head==null){
            tail=null;
        }
        size--;
        return h;
    }
    static Node Delend(){
        Node k = tail;
        k = k.prev;
        k.next = null;
        tail = k;
        if(size<=1){
            Delbeg();
        }
        size--;
        return k;
    }
    static Node DelAny() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position to delete: ");
        int a = sc.nextInt();
        if (a == 1) {
            Delbeg();
        } else if (a == size) {
            Delend();
        } else {
            Node temp = head;
            for (int i = 1; i < a - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            temp.next.prev = temp;
            size--;
            return temp;
        }
        return head;
    }
    static void sort(){
        for(int i = 1 ; i < size -1 ;i++){
            Node k = head;
            Node p = k.next;
              for(int j = 0 ; j< size-i-1 ;j++){
                  if(k.marks>p.marks){
                      float temp = k.marks;
                      k.marks = p.marks;
                      p.marks = temp;

                      int tempq = k.regd_no;
                      k.regd_no = p.regd_no;
                      p.regd_no = tempq;
                  }
                  k = p;
                  p = k.next;

              }
        }
    }
    static void reverse(){
        Node a = head;
        Node b = a.next;
        Node c = b.next;
        a.next = null;
        tail = head;
        while(c!=null){
            b.next = a;
            a.prev = b;
            a=b;
            b=c;
            c = c.next;
        }
        b.next = a;
        a.prev = b;
        head = b;
    }
    static void display(){
        Node temp = tail;
        while(temp!=null){
            System.out.println("Regd_no: " + temp.regd_no);
            System.out.println("Marks: " + temp.marks);
             temp = temp.prev;
        }
    }

    public static void main(String[] args) {
        create();
        sort();
        display();
    }
}
