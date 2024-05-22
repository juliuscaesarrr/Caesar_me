package Lectures.DSA.binarySearch;
//Q1:
//sorted array me key ki first aur last position nikal ni hai...
/*
public class Questions {
    public static void main(String[] args) {
        int[]array={0,0,0,1,2,2,2,2,2,3,4,5,6,88,89};
        System.out.println(firstOccurence(array,2));
        System.out.println(lastOccurence(array,2));
    }
    public static int firstOccurence(int[] array, int key) {
        int start = 0;
        int end = array.length;
        int i = -1;
        int mid = (start + end) / 2;
        while (start <= end) {
            if (key == array[mid]) {
                i = mid;
                end = mid -1;
            } else if (key <array[mid]) {
                end = mid - 1;
            } else if (key >array[mid]) {
                start = mid + 1;
            }
            mid = (start + end) / 2;
        }
        return i;
    }
public static int lastOccurence(int[] array, int key) {
    int start = 0;
    int end = array.length;
    int j = -1;
    int mid = (start + end) / 2;
    while (start <= end) {
        if (key == array[mid]) {
            j = mid;
            start = mid + 1;
        } else if (key <array[mid]) {
            end = mid - 1;
        } else if (key >array[mid]) {
            start = mid + 1;
        }
        mid = (start + end) / 2;
    }
    return j;
}
}
*/

//Q2:
// Number of Occurence dhundna hai...
/*
public class Questions {
    public static void main(String[] args) {
        int[] array = {0, 0, 0, 1, 2, 2, 2, 2, 2, 3, 4, 5, 6, 88, 89};
        System.out.println(firstOccurence(array, 2));
        System.out.println(lastOccurence(array, 2));
        System.out.println("No of Occurence: " +
                (lastOccurence(array, 2)-
                firstOccurence(array, 2)) + 1 );
    }

    public static int firstOccurence(int[] array, int key) {
        int start = 0;
        int end = array.length;
        int i = 0;
        int mid = (start + end) / 2;
        while (start <= end) {
            if (key == array[mid]) {
                i = mid;
                end = mid - 1;
            } else if (key < array[mid]) {
                end = mid - 1;
            } else if (key > array[mid]) {
                start = mid + 1;
            }
            mid = (start + end) / 2;
        }
        return i;
    }

    public static int lastOccurence(int[] array, int key) {
        int start = 0;
        int end = array.length;
        int j = 0;
        int mid = (start + end) / 2;
        while (start <= end) {
            if (key == array[mid]) {
                j = mid;
                start = mid + 1;
            } else if (key < array[mid]) {
                end = mid - 1;
            } else if (key > array[mid]) {
                start = mid + 1;
            }
            mid = (start + end) / 2;
        }
        return j;
    }
}
*/

//Q3:
//mountain array me sabse maximum element dhundna haiii...
/*
public class Questions{
    public static void main(String[] args) {
        int[]array={0,2,5,8,6,5,4,3,2,1,0};
        System.out.println(peakNumber(array));
    }
    public static int peakNumber(int[]array){
        int start = 0;
        int end = array.length - 1;
        int mid;
        while(start<end) {
            mid = start + (end - start) /2;
             if(array[mid]<array[mid+1]){
                 start = mid + 1;
               }
               else{
                 end = mid;
                }
            }
          return array[end];// array[start]
    }
}
*/

//Q4:
//find pivot in an array
/*
public class Questions{
    public static void main(String[] args) {
    int[]arr={7,8,9,1,2,3};
        System.out.println(pivotElement(arr));
    }
    public static int pivotElement(int [] arr){
       int s = 0;
       int e = arr.length - 1;
       int m;
        while(s<=e){
            m = s + (e - s)/2;
        if(arr[m]<arr[m + 1]){
            s = m + 1;
        }
        else{
            e = m;
        }
        }
        return arr[s];
    }
}
*/

// find the square root using the binary search
/*
public class Questions{
    public static int findSQRT(int k){
       int start = 0;
       int end = k;
       while(start<=end){
           int mid = (start + end)/2;
           if((mid*mid)==k){
               return mid;
           }
           else if((mid*mid)>k){
               end = mid - 1;
           }
           else if((mid*mid)<k){
               start = mid + 1;
           }
       }
       return -1;
    }
    public static void main(String[] args) {
        System.out.println(findSQRT(100));
    }
}
*/

// Find square root of other numbers such as 37
/*
public class Questions{
    public static double findSQRT(double k){
        double start = 0;
        double end = k;
        double p = 0;
        double s = 0;
        while(start<=end){
            double mid = (start + end)/2;
            if((mid*mid)<k){
              p=mid;
              start = mid + 1;
            }
            else if((mid*mid)>k){
                end = mid - 1;
            }
        }
        while(true){
            p=p+0.1;
            if((p*p)<k){
                s = p;
            }
            else if((p*p)==k){
                return p;
            }
            else{
                break;
            }
        }
        double m = 0;
        while(true){
            s = s+0.01;
            if((s*s)<=k){
                m = s;
            }
            else{
                break;
            }
        }
        return m;
    }
    public static void main(String[] args) {
        System.out.println(findSQRT(37));
    }
}
*/

// Book allocation problem
public class Questions {

    public static void main(String[] args) {

    }
}