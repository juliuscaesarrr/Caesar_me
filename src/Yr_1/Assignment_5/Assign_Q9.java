package Assignment_5;
import java.util.Scanner;
public class Assign_Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:- ");
        int n = sc.nextInt();
        double sum = 0;
        for(int i = 1 ; i <= n ; i++){
            double j = 1.0/(i*i);
            sum+=j;
        }
        System.out.println(sum);
    }
}
