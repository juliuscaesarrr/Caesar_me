package Assignment_4;

import java.util.Scanner;

public class Assign_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int j = 0;
        System.out.print("Random numbers "
                + "generated are: ");
        int k;
        int count = 0;
        do {
            k = (int) (Math.random() * (a - 1 + 1) + 1);
            System.out.print(k + " ");
            j += k;
            count++;
        } while (count < a);
        System.out.println("The Average is: " + (double) j / a);
    }
}

