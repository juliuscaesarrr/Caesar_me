package Assignments.Assignment_3;
import java.util.Scanner;
public class QH5{
   static String Reversing(String k,int n){
       if(n>=0){
           return k.charAt(n) + Reversing(k,n-1);
       }else
         return "";
   }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String s = sc.next();
        System.out.print(Reversing(s,s.length() - 1));
    }
}