package Assignments.Assignment_3;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] arr = new String[4];
        try{
            for(int i = 0 ; i < arr.length ; i++){
                arr[i]=sc.nextLine();
            }
            int a = Integer.parseInt(arr[3]);
        }
        catch(Exception e){
            System.out.println("Problem: " + e);
        }
        try{
            System.out.println(arr[6]);
        }
        catch(Exception f){
            System.out.println(f);
        }
    }
}
