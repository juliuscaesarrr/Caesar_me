package Assignments.Assignment_1;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
         int k = sc.nextInt();
         int sum = 0;
         int multi = 1;
         while(k!=0){
            sum+=k%10;
            multi*=k%10;
            k/=10;
        }
         if(sum==multi){
             System.out.println("Yes, it is a spy number!!");
         }
         else{
             System.out.println("No, it is not a spy number!!");
         }
    }
}
