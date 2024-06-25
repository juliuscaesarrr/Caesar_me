package Lectures.DSA.cycleSort;
import java.util.Scanner;
// when given number from 1 to n than use "cycle sort";
public class cycleSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 6, 1, 2};
        int p = 0;
        while (p < arr.length) {
           if (arr[p] != (p + 1)) {
                int k = arr[p];
                arr[p] = arr[k - 1];
                arr[k - 1] = k;
            }else{
            p++;
        }
        }
        for(int a : arr) {
            System.out.print(a + " ");
        }
    }
}

