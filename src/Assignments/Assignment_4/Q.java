package Assignments.Assignment_4;
import java.util.Scanner;
    class Node{
        protected int regd_no;
        protected float marks;
        protected Node next;
        Node(int regd_no, float marks){
            this.regd_no = regd_no;
            this.marks = marks;
        }
        Node(int regd_no, float marks, Node next){
            this.regd_no = regd_no;
            this.marks = marks;
            this.next = next;
        }
    }
public class Q {
           static Node head = null;
           static Node tail = null;
           static int size = 0;
           public static void create(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Registration no: ");
            int k = sc.nextInt();
            System.out.print("Enter Marks: ");
            int j = sc.nextInt();
        Node n = new Node(k,j);
            head = n;
            tail = n;
            size++;
            System.out.println("Do you want to add more elements(yes(1)|no(0): ");
        char p = sc.next().charAt(0);
            while(p!='n'){
                System.out.print("Enter Registration no: ");
                 k = sc.nextInt();
                System.out.print("Enter Marks: ");
                 j = sc.nextInt();
                Node np = new Node(k,j);
                tail.next = np;
                tail = np;
                System.out.println("Do you want to add more elements(yes(1)|no(0): ");
                 p = sc.next().charAt(0);
                 size++;
            }
        }
         public static void Inbeg(int regd_no,float marks ){
            Node temp = head;
            Node s = new Node(regd_no,marks);
            s.next = temp;
            head = s;
            if(head==null){
                tail=null;
            }
            size++;
         }
         public static Node Inend(int regd_no,float marks){
            Node y = new Node(regd_no,marks);
            tail.next = y;
            tail = y;
            size++;
            if(tail==null){
                Inbeg(regd_no,marks);
            }
            size++;
            return y;
         }
         public static Node InAnypos(int regd_no,float marks,int index){
                Node temp = head;
            Node k = new Node(regd_no,marks);
          for(int i = 1 ; i < index - 1 ; i++){
              temp = temp.next;
          }
          k.next = temp.next;
          temp.next = k;
          size++;
          return k;
         }
     public static Node DelBeg(){
         Node p = head;
            p = p.next;
            head = p;
            if(head==null){
                tail = null;
            }
             size--;
            return p;
     }
    public static Node DelEnd(){
         Node temp = head;
        while(temp.next!=tail){
            temp = temp.next;
        }
        if(size<=1){
            DelBeg();
        }
        temp.next = null;
        tail = temp;
         size--;
        return temp;
    }
    public static Node DelAny(int pos){
      Node temp = head;
            for(int i = 1; i < pos - 1; i++){
          temp = temp.next;
      }
          temp.next = temp.next.next;
            return temp;
    }
    public static void search(){
        Node temp = head;
        int x = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the registration no: ");
            int a = sc.nextInt();
            while (temp!= null) {
                if (temp.regd_no == a) {
                    x=1;
                    break;
                }
                temp = temp.next;
            }
            if(x==1){
                System.out.println("Change the marks: ");
                temp.marks = sc.nextFloat();
            }
            else
                System.out.println("Invalid input");
            }
    public static void sort() {
        for (int i = 1; i < size - 1; i++) {
            Node n = head;
            Node p = n.next;
            for (int j = 0; j < size - i - 1; j++) {
                if (n.marks > p.marks) {
                    float temp = n.marks;
                    n.marks = p.marks;
                    p.marks = temp;

                    int tempq = n.regd_no;
                    n.regd_no = p.regd_no;
                    p.regd_no = tempq;
                }
                    n = p;
                    p = n.next;
                }
            }
        }
    static void count(){
          Node temp = head;
          int count  = 0;
            while(temp!=null){
                count++;
                temp = temp.next;
            }
        System.out.println("Total numbers of element: " + count);
    }
    static void reverse(){
            Node p = head;
            Node q = p.next;
            Node r = q.next;
            p.next = null;
           while(r!=null){
               q.next = p;
               p = q;
               q = r;
               r = r.next;
           }
           q.next = p;
           head = q;
    }
    static void display(){
            Node temp = head;
            while(temp!=null){
                System.out.println("Regd: " + temp.regd_no);
                System.out.println("Marks: " + temp.marks);
            temp = temp.next;
            }
        }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
         while(true){
             System.out.println();
             System.out.println("Give some input Baby: ");
             System.out.println("Create '1'");
             System.out.println("Display '2'");
             System.out.println("Insert At Beginning '3'");
             System.out.println("Insert At End '4'");
             System.out.println("Insert At Any Position '5'");
             System.out.println("Delete At Beginning '6'");
             System.out.println("Delete At AnyPoint '7'");
             System.out.println("Delete At End '8'");
             System.out.println("Sort '9'");
             System.out.println("Search '10'");
             System.out.println("Reverse '11'");
             System.out.println("End '0'");
             System.out.println();
            int k = sc.nextInt();
             switch(k){
                 case 0:
                     System.exit(0);
                 case 1:
                     create();
                     break;
                 case 2:
                     display();
                     break;
                 case 3:
                     Inbeg(6229,69);
                     break;
                 case 4:
                     Inend(79,45);
                     break;
                 case 5:
                     InAnypos(100,75,2);
                     break;
                 case 6:
                     DelBeg();
                     break;
                 case 7:
                     DelAny(2);
                     break;
                 case 8:
                     DelEnd();
                     break;
                 case 9:
                     sort();
                     break;
                 case 10:
                     search();
                     break;
                 case 11:
                     reverse();
                     break;
                 case 12:
                     count();
                     break;
                 default:
                     System.out.println("enter a valid input");
             }
         }
    }
}
