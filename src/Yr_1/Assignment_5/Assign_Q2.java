package Assignment_5;
import java.util.Scanner;
public class Assign_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:- ");
        int k = sc.nextInt();
        boolean isPrime = true;
        boolean isTwistedprime = true;
        for(int i = 2; i < k ; i++){
            if(k % i == 0){
                isPrime = false;
                break;
            }
        }
        int digit,reverse = 0;
        while(k>0){
            digit = k % 10;
            reverse = reverse*10 + digit;
            k = k/10;
        }
        System.out.println("The reversed number is:- "+ reverse);
        int b = reverse;
        for(int j = 2 ; j < b ; j++){
            if(b % j == 0){
                isTwistedprime = false;
                break;
            }
        }
        if(isPrime || isTwistedprime){
            System.out.println("Yes!!! it is a twisted prime number");
        }
        else{
            System.out.println("No, it is not a twisted prime number");
        }
    }
}
