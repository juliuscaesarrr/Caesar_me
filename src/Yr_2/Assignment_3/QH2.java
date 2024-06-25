package Assignments.Assignment_3;
import java.util.Scanner;
public class QH2 {
 static int dhundle(int [] arr,int k,int start,int end) {
     int mid = (start+end)/2;
     if (start>end){
          return -1;
      }
     if(k==arr[mid])
         return (mid + 1);
     else if (k>arr[mid]) {
         start = mid + 1;
         return dhundle(arr, k,start,end);
     }
     else if (k<arr[mid]) {
         end = mid - 1;
         return dhundle(arr, k, start, end);
     }
     return 0;
 }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int [] arr ={1,2,3,4,5,6,7,8,9,10};
     System.out.println(dhundle(arr,79,0,9)+"th Position");
    }
}
