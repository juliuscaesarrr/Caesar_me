package Lectures.DSA.cycleSort;
import java.util.Scanner;
public class Questions {
    // Q1 : Numbers from 0 to n and a number is missing
    static int lawdene_khojyam(int [] lawde){
        int p = 0;
        while (p < lawde.length) {
            if (lawde[p] < lawde.length && lawde[p] != (p)) {
                int k = lawde[p];
                lawde[p] = lawde[k];
                lawde[k] = k;
            }else{
                p++;
            }
        }
        // search
        for(int i = 0 ; i < lawde.length ; i++) {
            if (lawde[i] != i) {
                return i;
            }
        }
        return lawde.length;
        }

 //Q2:
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {0,3,1,5,2};
        System.out.println(lawdene_khojyam(arr));
     }
}