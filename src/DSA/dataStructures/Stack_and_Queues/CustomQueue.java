package DSA.dataStructures.Stack_and_Queues;
import java.util.Scanner;
public class CustomQueue {
        protected int [] data;
        private static final int Default_Size = 10;
        int end = - 1;
        public CustomQueue(){
            this(Default_Size);
        }
        public CustomQueue(int size){
            this.data = new int [size];
        }
        public boolean push(int item){
            if(isFull()){
                return false;
            }
            else{
                end++;
                data[end] = item;
            }
            return true;
        }
        public boolean isFull(){
            return end == data.length - 1;
        }
        public boolean isEmpty(){
            return end == -1;
        }
        public int pop() throws Exception{
            if(isFull()){
                throw new Exception("Your queue is full");
            }
            int removed = data[0];
            for(int i = 1; i <=end ;i++){
                data[i-1]=data[i];
            }
            return removed;
        }
        public void display(){
            if(isEmpty()){
                System.out.println("Your stack is empty");
            }
            else{
                for(int i = end ; i>=0 ; i--){
                    System.out.println(data[i]);
                }
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            CustomQueue k = new CustomQueue(10);
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
                        try{
                            System.out.println("Removed item: " + k.pop());
                        }
                        catch(Exception e){
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
