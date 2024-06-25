package Assignment_5;
import java.util.Scanner;
public class Assign_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me the first fuckin number:- ");
        int a = sc.nextInt();
        System.out.println("Give me the second fuckin number:- ");
        int b = sc.nextInt();
        int sum1= 0;
        int sum2= 0;
        System.out.println("Factors of " + a + " are:- ");
        for(int i = 1 ; i < a ; i++){
            if((a % i) == 0){
                System.out.print( i + " ");
                sum1+=i;
            }
        }
        System.out.println("Factors of " + b + " are:- ");
        for(int j = 1 ; j < b ; j++){
            if((b % j)==0){
                System.out.println(j + " ");
                sum2+=j;
            }
        }
        if(sum1 == b && sum2 == a ){
            System.out.println("Yes!! it is a motherfuckin number...");
        }
        else{
            System.out.println("No!! it is not a motherfuckin number...");
        }
    }
}
