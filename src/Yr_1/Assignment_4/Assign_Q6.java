package Assignment_4;

import java.util.Scanner;

public class Assign_Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base: ");
        int k = sc.nextInt();
        System.out.println("Enter the power: ");
        int n = sc.nextInt();
        int p = 1;
        for (int z = 1; z <= n; z++) {
            p *= k;
        }
        System.out.println(k + " to the power " + n + " is " + p);
    }
}
