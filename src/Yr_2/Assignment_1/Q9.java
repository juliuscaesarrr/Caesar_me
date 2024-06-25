package Assignments.Assignment_1;

import java.util.Scanner;

public class Q9 {
    public static double sumMajorDiagonal(double[][] m){
       double sum = 0;
        for(int i = 0 ; i < m.length ; i++){
            sum+=m[i][i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number columns and rows: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        double[][] arr = new double[a][b];
        System.out.println("Enter elements in the array: ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = sc.nextDouble();
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(sumMajorDiagonal(arr));
    }
}
