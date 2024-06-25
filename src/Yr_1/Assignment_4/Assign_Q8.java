package Assignment_4;

import java.util.Scanner;

public class Assign_Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int uG;
        int cG;
        do {
            System.out.println("Enter your guess: ");
            uG = sc.nextInt();
            cG = (int) (Math.random() * (10 - 1 + 1) + 1);
            System.out.println(cG);
            if (cG < uG) {
                System.out.println("Too high, try again");
            } else if (cG > uG) {
                System.out.println("Too low, try again");
            } else {
                System.out.println("Good guess");
            }
        } while (cG != uG);
    }
}
