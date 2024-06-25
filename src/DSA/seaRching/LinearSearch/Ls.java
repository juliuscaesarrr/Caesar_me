package DSA.seaRching.LinearSearch;

public class Ls {
    public static void main(String[] args) {
        int [] arr = {1,5,2,7,9,6,33,45,4,66};
        int key = 5;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == key){
                System.out.println("Index: " + i);
                break;
            }
        }
    }
}
