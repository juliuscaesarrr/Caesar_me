package Assignments.Assignment_3;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int a = sc.nextInt();
            if(a<0){
                throw new NumberFormatException();
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
