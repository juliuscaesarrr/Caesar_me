package Assignment_5;
import java.util.Scanner;
public class Assign_Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 2;
        int b = 15;
        for(int i = a ; i <= b ; i++){
            System.out.println("The multiplication table of "+ i + " is:- ");
            for(int j = 1 ; j <= 10 ; j++){
                int k = i*j;
                System.out.println(i + " X " + j +" = "+ k);
            }
        }

    }
}
