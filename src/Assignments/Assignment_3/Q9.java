package Assignments.Assignment_3;
import java.util.Scanner;
public class Q9 {
    public static int s(int k) {
        if (k > 10) {
            System.out.print(k % 10);
            return s(k / 10);
        }
        else
            return k;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(s(123456789));
    }
}
