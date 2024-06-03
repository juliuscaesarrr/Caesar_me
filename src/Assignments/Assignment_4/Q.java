package Assignments.Assignment_4;
import java.util.Scanner;
class Node {
    protected int regd_no;
    protected float marks;
    protected Node next;
}
public class Q {
    public static Node start = null;
    static int size = 0;

    public static Node create(Node start){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Registration no: ");
        int k = sc.nextInt();
        System.out.print("Enter Marks: ");
        int j = sc.nextInt();

        Node p = new Node();
        p.regd_no = k;
        p.marks = j;
        start = p;
        size++;
        System.out.println("Do you want to add more elements(y|n): ");
        char l = sc.next().charAt(0);
        while(l!='n'){
            System.out.print("Enter Registration no: ");
            k = sc.nextInt();
            System.out.print("Enter Marks: ");
            j = sc.nextInt();

            Node q = new Node();
            q.regd_no = k;
            q.marks = j;
            p.next = q;
            p = q;
            System.out.println("Do you want to add more elements(yes(1)|no(0): ");
            l = sc.next().charAt(0);
            size++;
        }
        return start;
    }
    public static Node Inbeg(Node start){
        Scanner sc = new Scanner(System.in);
        if(start==null){
            System.out.println("Your list is null");
        }
        else {
            Node s = new Node();
            System.out.println("Enter registration no: ");
            s.regd_no = sc.nextInt();
            System.out.println("Enter marks: ");
            s.marks = sc.nextInt();
            s.next = start;
            start = s;
            size++;
        }
        return  start;

    }
    public static Node Inend(Node start){
        Scanner sc = new Scanner(System.in);
        if(start==null){
            System.out.println("Your list is null");
        }
        else {
            Node s = new Node();
            System.out.println("Enter registration no: ");
            s.regd_no = sc.nextInt();
            System.out.println("Enter marks: ");
            s.marks = sc.nextInt();

            Node temp = start;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = s;
        }
        return  start;

    }
    public static Node InAny(Node start){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index: ");
        int index = sc.nextInt();

        if(index==1){
            Inbeg(start);
        } else if (index==size) {
            Inend(start);
        }
        else {
            Node k = new Node();
            System.out.println("Enter registration no: ");
            k.regd_no = sc.nextInt();
            System.out.println("Enter marks: ");
            k.marks = sc.nextInt();

            Node temp = start;
            for (int i = 1; i < index - 1; i++) {
                temp = temp.next;
            }
            k.next = temp.next;
            temp.next = k;
            size++;
        }
        return start;
    }
    public static Node DelBeg(Node start){
        if(start==null){
            System.out.println("Your list is empty!!");
        }
        else {
            Node p = start;
            p = p.next;
            start = p;
            size--;
        }
        return start;
    }
    public static Node DelEnd(Node start) {
        if (size <= 1) {
            DelBeg(start);
        } else {
            Node temp = start;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp = null;
            size--;
        }
        return  start;
    }
    public static Node DelAny(Node start){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index: ");
        int index = sc.nextInt();

        Node temp = start;
        for(int i = 1 ; i < index - 1 ; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
        return start;
    }
    public static void search(Node start){
        Node temp = start;
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
    public static void sort(Node start) {
        for (int i = 0; i < size - 1; i++) {
            Node n = start;
            Node p = n.next;
            for (int j = 0; j < size - i - 1 ; j++) {
                if (n.marks < p.marks) {
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
    static int count(Node start){
        Node temp = start;
        int count  = 0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        System.out.println("Total numbers of element: " + count);
        return count;
    }
    static Node reverse(Node start){
        Node p = start;
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
        start = q;
        return start;
    }
    static void display(Node start){
        Node temp = start;
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
            System.out.println("Count '12'");
            System.out.println("End '0'");
            System.out.println();
            int k = sc.nextInt();
            switch(k){
                case 0:
                    System.exit(0);
                case 1:
                    start = create(start);
                    break;
                case 2:
                    display(start);
                    break;
                case 3:
                    start = Inbeg(start);
                    break;
                case 4:
                    start = Inend(start);
                    break;
                case 5:
                    start = InAny(start);
                    break;
                case 6:
                    start = DelBeg(start);
                    break;
                case 7:
                    start =  DelAny(start);
                    break;
                case 8:
                    start =  DelEnd(start);
                    break;
                case 9:
                    sort(start);
                    break;
                case 10:
                    search(start);
                    break;
                case 11:
                    start = reverse(start);
                    break;
                case 12:
                    count(start);
                    break;
                default:
                    System.out.println("enter a valid input");
            }
        }
    }
}