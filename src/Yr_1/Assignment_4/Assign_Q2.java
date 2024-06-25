package Assignment_4;

import java.util.Scanner;

public class Assign_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int z = a;
        int j = 0;
        while (z != 0) {
            int k = z % 10;
            j += k;
            z = z / 10;
        }
        System.out.println(j);
        if (j % 9 == 0) {
            System.out.println("The number " + a + " is divisible by 9");
        } else {
            System.out.println("The number " + a + " is not divisible by 9");
        }
    }
}


