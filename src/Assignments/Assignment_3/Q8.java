package Assignments.Assignment_3;
import java.util.Scanner;
public class Q8 {
    public static int b (int k,int r){
        if(r!=0)
            return k * b(k,r-1);
        else
            return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base: ");
        int k = sc.nextInt();
        System.out.println("Enter the power: ");
        int r = sc.nextInt();
        System.out.println(b(k,r));
    }
}
