package Assignments.Assignment_1;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
       int k = sc.nextInt();
       int X = 0;
        while(k>2){
           k/=2;
           X++;
       }
        System.out.println(X);
    }
}
