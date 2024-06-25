package Assignments.Assignment_3;
import java.util.Scanner;
public class Q7 {
    public static int factorial(int k) {
         if (k > 1)
            return k * factorial(k - 1);
         else
            return 1;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find factorial: ");
        int k = sc.nextInt();
        System.out.println(factorial(5));

    }
}
