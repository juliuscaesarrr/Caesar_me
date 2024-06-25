package Assignment_5;
import java.util.Scanner;
public class Assign_Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int a = sc.nextInt();
        System.out.println("Enter your second number: ");
        int b = sc.nextInt();
        for(int i = a ; i <= b ; i++){
            int multi = 1;
            for(int j = i ; j >= 1  ; j--){
                multi=multi*j;
            }
            System.out.println("Factorial of "+ i + " is " + multi);
        }
    }
}
