package Lectures.DSA.selectionSORT;

public class selectionSort {
    public static int[] arr2(int[] arr) {
        int k = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    k = j;
                }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[k] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 9, 8, 5, 4, 2};
        int [] k = arr2(arr);
        for(int a : k){
            System.out.print(a + " ");
        }
    }
}


