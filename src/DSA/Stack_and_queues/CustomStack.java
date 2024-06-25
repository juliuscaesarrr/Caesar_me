package Lectures.DSA.Stack_and_queues;
import java.util.Scanner;
public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Can not peek from an empty Stack");
        }
        return data[ptr];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Your stack is empty");
        } else {
            for (int i = ptr; i >= 0; i++) {
                System.out.println(data[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of stack: ");
        int a = sc.nextInt();
        dynamicStack k = new dynamicStack(a);
        while (true) {
            System.out.println("***MENU***");
            System.out.println("0: Exit");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Check if full");
            System.out.println("4: Check if empty");
            System.out.println("5: Display");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    System.out.println("Enter an item: ");
                    int item = sc.nextInt();
                    k.push(item);
                    break;
                case 2:
                    try {
                        System.out.println("Removed item: " + k.pop());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    k.isFull();
                    break;
                case 4:
                    k.isEmpty();
                    break;
                case 5:
                    k.display();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
class dynamicStack extends CustomStack{
    public dynamicStack(){
        super();
    }
    public dynamicStack(int size){
        super(size);
    }
    @Override
    public boolean push(int item) {
        if(this.isFull()){
            int [] temp = new int[data.length*2];
            // increase the size
            for(int i = 0; i <data.length ; i++){
                temp[i]=data[i];
            }
            data = temp;
        }
        return super.push(item);
    }
}
