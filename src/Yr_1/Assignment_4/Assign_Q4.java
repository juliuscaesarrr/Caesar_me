package Assignment_4;

import java.util.Scanner;

public class Assign_Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int a = sc.nextInt();
        System.out.println("Enter your second number: ");
        int b = sc.nextInt();
        int r; // r ko intialize krr
        do {
            r = a % b;
            a = b;
            b = r;
        } while (r != 0);

        System.out.println(a);
    }
}
