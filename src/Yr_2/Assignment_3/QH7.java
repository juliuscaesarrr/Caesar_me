package Assignments.Assignment_3;

public class QH7 {
    public static int i = 0;
    public static int j = 0;
    static int sorter(int [] arr,int k){
        if(i!=arr.length){
            if(arr[i]<=k){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            i++;
            return sorter(arr,k);
        }
        else{
            return 0;
        }
    }
    static void sorting(int [] arr,int k){
        sorter(arr,k);
        for(int t = 1 ; t < arr.length ; t++) { // taki pura sort ho sake
            for (int m = 0; m < arr.length - t; m++) {
                if (arr[m] > arr[m + 1]) {
                    int temp = arr[m];
                    arr[m] = arr[m + 1];
                    arr[m + 1] = temp;
                }
            }
        }
            for(int a : arr){
                System.out.println(a);
            }
        }
    public static void main(String[] args) {
        int [] arr = {10,9,8,7,6,5,4,3,2,1,0};
        sorting(arr,5);
    }
}
