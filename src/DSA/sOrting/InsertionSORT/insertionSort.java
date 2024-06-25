package DSA.sOrting.InsertionSORT;

public class insertionSort {
    public static int [] arr2(int [] arr){
        for(int i = 1 ; i<arr.length ; i++){
            int temp = arr[i];
            int j = i-1;
            for( ; j >=0 ; j--){
                if(arr[j]>temp){
                    //shift
                    arr[j+1] = arr[j];
                }
                else{
                    break;
                }
            }
            arr[j+1] = temp;
            // agar kuch nhi ho rha tb wohi value
            // firse store kr rha h
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] array = {85,7,4,5,6,56,96,52};
        int [] k = arr2(array);
        for(int a : k){
            System.out.print(a +" ");
        }
    }
}
//is me shift kr rahe , swap nhi kr rahe
// n(no of elements) , Rounds = (n-1)
//while loop se krr isse

