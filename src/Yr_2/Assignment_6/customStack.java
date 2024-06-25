package Assignments.Assignment_6;
import java.util.Scanner;
    public class customStack {
        public static final int Max = 10;
        public int push(int[] s,int top) {
            Scanner sc = new Scanner(System.in);
            if (isFull(top)) {
                System.out.println("Stack is full");
                return top;
            }
            System.out.println("Enter an item: ");
            int item = sc.nextInt();
            top++;
            s[top] = item;
            return top;
        }
        public static boolean isFull(int top) {
            return top == Max-1;
        }
        public static boolean isEmpty(int top) {
            return top == -1;
        }
        public int pop(int s[],int top){
            if (isEmpty(top)) {
                System.out.println("Stack is empty");
                return top;
            }
            int removed = s[top];
            System.out.println("Removed item: " + removed);
            top--;
            return top;
        }
        public void display(int s[],int top) {
            if (isEmpty(top)) {
                System.out.println("Your stack is empty");
            } else {
                for (int i = top; i >= 0; i--) {
                    System.out.println(s[i]);
                }
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter size of stack: ");
            int max = sc.nextInt();
            int [] arr = new int[Max];
            int top = -1;
            customStack k = new customStack();
            while (true) {
                System.out.println("MENU");
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
                        top = k.push(arr,top);
                        break;
                    case 2:
                        top = k.pop(arr,top);
                        break;
                    case 3:
                        System.out.println(isFull(top));
                        break;
                    case 4:
                        System.out.println(isEmpty(top));
                        break;
                    case 5:
                        k.display(arr,top);
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            }
        }
    }


