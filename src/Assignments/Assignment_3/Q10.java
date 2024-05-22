package Assignments.Assignment_3;
import java.util.Scanner;
public class Q10 {
    public static int fibonacci(int k,int a , int b){
        int c = 0;
        if(k>2){
            c = a+b;
            a=b;
            b=c;
          return fibonacci(k-1,a,b);
        }
        else if (k==1){
            return a;
        } else if (k==2) {
            return b;
        } else{
            return c;
        }
    }
    /*
    static int fibonacci(int a){
    if(a<=1){
    return a;
    }
    else
     return fibonacci(a-1) + fibonacci(a-2);
     }
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type first number: ");
        int a = sc.nextInt();
        System.out.println("Type second number: ");
        int b = sc.nextInt();
        System.out.print("Type the position: ");
        int c = sc.nextInt();
        System.out.println(fibonacci(c,a,b));
    }
}//change b = a , if you want to find fibonacci series of 0 and 1
