package DSA.sOrting.bubbleSORT;

public class bubbleSort {
    public static int [] arr2(int [] arr){
        for(int i = 1 ; i < arr.length ; i++) { // taki pura sort ho sake
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
     int [] arr = {6,2,8,4,10,8,3};
     int [] k  = arr2(arr);
     for(int b : k){
         System.out.print(b + " ");
     }
    }
}
