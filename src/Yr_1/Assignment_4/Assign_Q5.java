package Assignment_4;

import java.util.Scanner;

public class Assign_Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int k = 1;
        int n = 0;
        while (k < a) {
            if (a % k == 0) {
                n = n + k;
            }
            k++;
        }
        if (n % a == 0) {
            System.out.println(a + " is a perfect number");
        } else {
            System.out.println(a + " is not a perfect number");
        }
    }
}
