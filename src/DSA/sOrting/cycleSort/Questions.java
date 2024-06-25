package DSA.sOrting.cycleSort;
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

 //Q2: duplicate element
 static int lawdene_duplicatum(int [] lawde) {
     int p = 0;
     while (p < lawde.length) {
         int k = lawde[p];
         if (lawde[k - 1] != (k) && lawde[p] != (p + 1)) {
             lawde[p] = lawde[k - 1];
             lawde[k - 1] = k;
         } else if (lawde[k - 1] == (k) && lawde[p] != (p + 1)) {
             System.out.println(lawde[k]);
             break;
         } else {
             p++;
         }
     }
     return 0;
 }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     //int [] arr = {0,1,2,6,3,5};
       // System.out.println(lawdene_khojyam(arr));
        //    int [] arr = {1,3,2,3,4};
      //  lawdene_duplicatum(arr);
     }
}