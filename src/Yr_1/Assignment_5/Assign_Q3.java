package Assignment_5;
import java.util.Scanner;
public class Assign_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number:- ");
        int a = sc.nextInt();
        System.out.println("Enter your second number:- ");
        int b = sc.nextInt();
        int k;
        for( k = a+1; k < b ; k++){
            boolean isPrime = true;
            for( int i = 2; i < k ; i++){
                if(k % i ==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(k+ " ");
            }
        }
    }
}
