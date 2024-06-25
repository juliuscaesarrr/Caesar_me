package DSA.seaRching.binarySearch;

public class binarySearch {
    static int index(int [] array , int key ){
            int start = 0;
            int end = array.length - 1;
            int mid = (start + end)/2;
            while(start<=end){
                if(key==array[mid]){
                    return mid;
                }
                else if(key>array[mid]){
                    start = mid + 1;
                }
                else if(key<array[mid]){
                    end = mid - 1;
                }
                mid = (end + start)/2;
            }
            return -1;
        }
        public static void main(String[] args) {
            int [] array ={2,3,4,5,6,7,8,9};
            System.out.println(index(array,7));
        }
}
