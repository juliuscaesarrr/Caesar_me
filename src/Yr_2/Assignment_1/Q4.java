package Assignments.Assignment_1;
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] s = {"C","A","R","B","O","N"};
        for (int a = 0; a < s.length; a++) {
            for (int b = 0; b < s.length; b++) {
                for (int c = 0; c < s.length; c++)
                    for (int d = 0; d < s.length; d++) {
                        for (int e = 0; e < s.length; e++) {
                            for (int f = 0; f < s.length; f++) {
                                if (a != b && a != c && a != d && a != e && a != f
                                        && b != c && b != d && b != e && b != f
                                        && c != d && c != e && c != f && d != e &&
                                        d != f && e != f) {
                                    System.out.println(s[a]+s[b]+s[c]+s[d]+
                                            s[e]+s[f]);
                                }
                            }
                        }
                    }
               }
           }
       }
   }
