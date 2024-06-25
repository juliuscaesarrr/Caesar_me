package Assignment_4;

import java.util.Scanner;

public class Assign_Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int a = sc.nextInt();
        double max = Integer.MIN_VALUE;
        double b;
        for (int i = 1; i < a / 2; i++) {
            b = Math.pow(3, i);
            if (b <= a) {
                if (b > max) {
                    max = b;
                }
            }
        }
        System.out.println(max);
        //Without using pow function:-
      /*  System.out.println("Enter a number:- ");
        int a = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int b = 1;
        while(b<=a/3){
            b=b*3;
            max = b;
        }
        System.out.println(max);
    }
*/
    }
}
