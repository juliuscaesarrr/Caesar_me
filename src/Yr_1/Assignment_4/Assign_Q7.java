package Assignment_4;

import java.util.Scanner;

public class Assign_Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        System.out.println("The multiplication table of " + a + " is ");
        for (int k = 1; k <= 10; k++) {
            int n = k * a;
            System.out.println(a + " X " + k + " = " + n);
        }
    }
}

