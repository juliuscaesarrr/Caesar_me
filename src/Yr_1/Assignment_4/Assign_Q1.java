package Assignment_4;

import java.util.Scanner;

public class Assign_Q1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        int a = sc.nextInt();
        System.out.print("b: ");
        int b = sc.nextInt();
        System.out.print("c: ");
        int c = sc.nextInt();
        int k = 0;
        int l = a;
        //  int z = a;
    /*  while(z<=b){
        System.out.print(z+" ");
        z = z + c;
     }*/
        for (int z = a; z <= b; ) {
            System.out.print(z + " ");
            k = k + z;
            z = z + c;
        }
        System.out.println(" ");
        System.out.print("sum is: ");
        System.out.print(k);
    }
}

