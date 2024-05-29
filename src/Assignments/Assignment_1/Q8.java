package Assignments.Assignment_1;
import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number columns and rows: ");
         int a = sc.nextInt();
         int b = sc.nextInt();
        int [][] arr = new int [a][b];
        int sum = 0;
        System.out.println("Enter elements in the array: ");
        for(int i = 0 ; i < a ; i++){
            for(int j = 0; j < b ; j++){
                arr[i][j]= sc.nextInt();
                sum+=arr[i][j];
            }
        }
        for(int i = 0 ; i < a ; i++){
            for(int j = 0; j < b ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Total: " + sum);
    }
}
