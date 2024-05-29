package Assignments.Assignment_1;

import java.util.Scanner;

public class Q10 {
    public static double sumColumn(double[][] m, int columnIndex){
        double sum = 0;
        for(int i = 0 ; i < m.length ; i++){
              sum+=m[i][columnIndex];
          }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] arr = new double[3][4];
        System.out.println("Enter elements in the array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextDouble();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(sumColumn(arr,0));
    }
    }

