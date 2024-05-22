package Lectures.DSA.LinkedLIST;
import java.util.Scanner;
public class singlyLList{
    static  Node head; static Node tail;
    static int size = 0 ;
    Scanner sc = new Scanner(System.in);
    void InsertAtHead(int v){
        Node n = new Node(v);
        n.next = head;
        head = n;
        if(tail==null){
            tail = head;//agar pehle null list ho to ek element add karne
            // ke bad head aur tail same rahega
        }
        size++;
    }
    void Nodecreate(){
        System.out.println("Enter the element in the node: ");
        int s = sc.nextInt();
        Node n = new Node(s);
        n.next = null;
        head = n;
        tail = n;
        System.out.println("Do you want add more node ? yes(1)/no(0)");
        int a = sc.nextInt();
        while(a!=0){
            System.out.println("Enter the element in the node: ");
            s = sc.nextInt();
            Node np = new Node(s);
            tail.next = np;
            tail = np;
            System.out.println("Do you want add more node ? yes(1)/no(0)");
            a = sc.nextInt();
        }
    }
    void InsertAtLast(int n){
        Node k = new Node(n);
        tail.next = k;
        tail = k;
        if(tail==null){
            InsertAtHead(n);

            return;
        }
        size++;
    }
    void Insert(int k, int index){
        if(index == 0){
            InsertAtHead(k);
            return;
        }
        if(index==1){
            InsertAtLast(k);
            return;
        }
        Node temp = head;
        for(int i = 1 ; i < index ; i++){
            temp = temp.next;
        }
        Node q = new Node(k,temp.next);
        temp.next = q;
    /*    Node q = new Node(k);
        temp.next = q.next;
        temp.next = q;
        size++;  */
     }
    void deleteFirst(){
        head = head.next;
        if(head ==null){
            tail = null;
        }
        size--;
    }
    void deleteLast(){
        if(size<=1){
            deleteFirst();
        }
        Node temp = head;
        while(temp.next!=tail){
            temp =  temp.next;
        }
        tail = temp;
        tail.next = null;
    }
    public static Node DelAny(int pos){
        Node temp = head;
        for(int i = 1; i < pos - 1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return temp;
    }
    void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("Size of node: " + size);
    }

    public static void main(String[] args) {
        singlyLList l = new singlyLList();
        l.InsertAtHead(46);      // Jo code pehle likha hai wohi
        l.InsertAtHead(26);      // wohi sequential run karega
        l.InsertAtLast(74);
        l.print();
        //    l.Nodecreate();
        //    l.print();
        //    l.Insert(29,0);
        //    l.print();
        l.deleteFirst();
        l.print();
        l.deleteLast();
        l.print();
    }
}