package Assignments.Assignment_1;
import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements: ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int z : arr) {
            if (z > max) {
                max = z;
            }
            if (z < min) {
                min = z;
            }
        }
        int countMx = 0;
        int countMn = 0;
        for (int z : arr) {
            if (z == max) {
                countMx++;
            }
            if (z == min) {
                countMn++;
            }
        }
        int posMx = 0;
        int posMn = 0;
        for (int s : arr) {
            posMx++;
            if (s == max) {
                break;
            }
        }
        for (int q = arr.length - 1; q >= 0; q--) {
            if (arr[q] == min) {
                posMn = q;
                break;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println(max);
        System.out.println(min);
        System.out.println(countMx);
        System.out.println(countMn);
        System.out.println(posMx);
        System.out.println(posMn  + 1);
    }
}
