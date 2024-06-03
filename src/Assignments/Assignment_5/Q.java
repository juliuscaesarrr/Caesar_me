package Assignments.Assignment_5;
import java.util.Scanner;
class Node{
    int regd_no;
    float marks;
    Node next;
    Node prev;
}
public class Q {
    static int size = 0;
    static Node start = null;
    static Node end = null;
    static Node create(Node start,Node end){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter regd no: ");
        int k = sc.nextInt();
        System.out.print("Enter marks: ");
        int s = sc.nextInt();

        Node p = new Node();
        start  = p;
        p.regd_no = k;
        p.marks = s;
        end = p;
        size++;
        System.out.println("Wants to create more node: (y/n): ");
        char c = sc.next().charAt(0);

        while(c!='n'){
            System.out.print("Enter regd no: ");
            k = sc.nextInt();
            System.out.print("Enter marks: ");
            s = sc.nextInt();
            Node q = new Node();
            q.regd_no = k;
            q.marks = s;

            end.next = q;
            q.prev = end;
            end = q;
            size++;
            System.out.println("Wants to create more node: (y/n): ");
            c = sc.next().charAt(0);
        }
        return end;
    }
    static Node Insbeg(Node start,Node end) {
        Scanner sc = new Scanner(System.in);
        if (start == null) {
            System.out.println("Your list is empty");
        } else {
            System.out.println("Enter new regd_no: ");
            int k = sc.nextInt();
            System.out.println("Enter new marks: ");
            int s = sc.nextInt();
            Node p = new Node();
            p.regd_no = k;
            p.marks = s;

            p.next = start;
            start.prev = p;
            start = p;
            size++;
        }
        return start;
    }
    static Node Insend(Node start, Node end) {
        Scanner sc = new Scanner(System.in);
        if (end == null) {
            Insbeg(start,end);
        }
        else {
            System.out.println("Enter new regd_no: ");
            int k = sc.nextInt();
            System.out.println("Enter new marks: ");
            int s = sc.nextInt();
            Node p = new Node();
            p.regd_no = k;
            p.marks = s;

            end.next = p;
            p.prev = end;
            end = p;
            size++;
        }
        return end;
    }
    static Node Inany(Node start, Node end) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter position: ");

        int pos = sc.nextInt();
        Node temp = start;
        if (pos == 1) {
            Insbeg(start,end);
        }
        else if (pos == size) {
            Insend(start,end);
        }
        else {
            System.out.println("Enter new regd_no: ");
            int k = sc.nextInt();
            System.out.println("Enter new marks: ");
            int s = sc.nextInt();
            Node p = new Node();
            p.regd_no = k;
            p.marks = s;

            for (int i = 1; i < pos - 2; i++) {
                temp = temp.next;
            }
            p.next = temp.next;
            temp.next = p;
            p.next.prev = p;
            p.prev = temp;
            size++;
        }
        return end;
    }
    static Node Delbeg(Node start, Node end) {
        if(start==null){
            System.out.println("Your list is empty");
        }
        else{
            start = start.next;
            start.prev = null;
            size--;
        }
        return start;
    }
    static Node Delend(Node start, Node end){
        if(start==null){
            System.out.println("Your list is empty");
        }
        Node k = end;
        k = k.prev;
        k.next = null;
        end = k;
        size--;
        return end;
    }
    static Node DelAny(Node start, Node end) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position to delete: ");
        int a = sc.nextInt();
        if (a == 1) {
            Delbeg(start, end);
        } else if (a == size) {
            Delend(start, end);
        } else {
            Node temp = start;
            for (int i = 1; i < a - 2; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            temp.next.prev = temp;
            size--;
            return temp;
        }
        return end;
    }
    static void sort(Node start, Node end){
        for(int i = 0 ; i < size -1 ;i++){
            Node k = start;
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
    static Node reverse(Node start, Node end){
        Node a = start;
        Node b = a.next;
        Node c = b.next;
        a.next = null;
        end = start;
        while(c!=null){
            b.next = a;
            a.prev = b;
            a=b;
            b=c;
            c = c.next;
        }
        b.next = a;
        a.prev = b;
        start = b;
        return start;
    }
    static void display(Node start, Node end){
        Node temp = start;
        while(temp!=null){
            System.out.println("Regd_no: " + temp.regd_no);
            System.out.println("Marks: " + temp.marks);
            temp = temp.next;
        }
    }
    static void count(Node start, Node end){
        Node temp = start;
        int c  = 0;
        while(temp!=null){
            c++;
            temp = temp.next;
        }
        System.out.println("Total numbers of element: " + c);
    }
    public static void search(Node start, Node end){
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
                    end = create(start,end);
                    start = end;
                    while(start.prev!=null){
                        start = start.prev;
                    }
                    break;
                case 2:
                    display(start, end);
                    break;
                case 3:
                    start = Insbeg(start, end);
                    break;
                case 4:
                    end  = Insend(start, end);
                    break;
                case 5:
                    end = Inany(start, end);
                    break;
                case 6:
                    start = Delbeg(start, end);
                    break;
                case 7:
                    end = DelAny(start, end);
                    break;
                case 8:
                    end  = Delend(start, end);
                    break;
                case 9:
                    sort(start, end);
                    break;
                case 10:
                    search(start, end);
                    break;
                case 11:
                    start =  reverse(start, end);
                    break;
                case 12:
                    count(start, end);
                    break;
                default:
                    System.out.println("enter a valid input");
            }
        }

    }
}