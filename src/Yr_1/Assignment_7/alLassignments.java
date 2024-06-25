package Assignment_7;
import java.util.Scanner;
public class alLassignments {
    //public static void main(String[] args) {
    //  Scanner sc = new Scanner(System.in);}}
  /*      int a = sc.nextInt();
        int[] z = new int[a];
        for (int i = 0; i < a; i++) {
            z[i] = sc.nextInt();
        }
        for (int i = 0; i < a; i++) {
            System.out.print(z[i] + " ");
        }
    }
}
*/
//Q3:-
/*
        int[] z = new int[10];
        for (int i = 0; i < z.length; i++) {
            z[i] = sc.nextInt();
        }
        int b = sc.nextInt();
        int count = 0;
        for (int t : z) {
            if (b == t) {
                count++;
            }
        }
        System.out.println(count);
    }
}
*/
//Q4:-
  /*  static double min(double[] array) {
        double min = array[0];
        for (double x : array) {
            if (x > min) {
                min = x;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        double [] array = {7, 5, 9, 45, 2, 5, 5, 1};
        System.out.println(min(array));
    }
}
*/
//Q5:-
    /*
    static double max(double[] array) {
        double max = array[0];
        for (double x : array) {
            if (x > max) {
                max = x;
            }
        }
        double max2 = 0;
        for(double x : array){
            if(x != max  && x > max2){
                max2 = x;
            }
        }
        return max2;
    }

    public static void main(String[] args) {
        double [] array = {7, 5, 9, 45, 2, 5, 5, 1};
        System.out.println(max(array));
    }
}
*/
//Q6:-
    /*
static void count(int [] array){
    int i = 0;
    int n = array.length;
    int j = n - 1;
    while(i<j){
       int temp = array[i];
       array[i]=array[j];
       array[j]=temp;
        i++;
        j--;
    }
   for(int e : array){
       System.out.print(e + " ");
   }
}

    public static void main(String[] args) {
        int [] array ={1,2,3,4,5,6,7};
        count(array);
    }
     */
    //Q7:-
    /*
    public static void main(String[] args) {
        int x = 124;
        int c = 0;
        while (x != 0) {
            int b = x % 8;
            x = x / 8;
            c = c * 10 + b;
        }
        int r = 1;
        while (c != 0) {
            int y = c % 10;
            c = c / 10;
            r = r * 10 + y;
        }
        System.out.println(r);
    }
*/
    //Q:-
    /*
    public static void main(String[] args) {
        int [] a = {1,5,6,8,8,9,6,4,5};
        for(int  b : a){
            System.out.print(b + " ");
        }
        int position = 3;
        for(int i = a.length -1; i >position; i--){
            a[i]=a[i-1];
        }
        int element = 7;
        a[position]=element;
        System.out.println(" ");
        for(int c : a){
            System.out.print(c+" ");
        }
        int position2 = 4;
        for(int i = position2; i<a.length-1 ; i++){
            a[i]=a[i+1];
        }
        System.out.println(" ");
        for(int d : a){
            System.out.print(d+" ");
        }
    }
    */
 /*   public static void main(String[] args) {


        int[] list = {4, 5, 4, 6, 1, 2, 3, 4};
        for (int a : list) {
            for (int i = 0; i < list.length; i++) {
                if (a == list[i]) {
                    System.out.print(a + " ");
                    break;
                } else {
                    System.out.print(a+" ");
                }
            }
        }
    }
}
*/
    //Q2:-
/*
   public static void main (String [] args){
   Scanner sc = new Scanner(System.in);
        int array [] = new int[100];
        for(int i = 0 ; i < array.length ; i++) {
        int a = sc.nextInt();
        if(a != 0){
            array[i] = a;
        }
        else{
            break;
        }
    }
        for(int j = 1 ; j < array.length ; j++){
        int count = 0;
        for( int k = 0 ; k <array.length ; k++){
            if(j == array[k]){
                count++;
            }
        }
        if(count==1){
            System.out.println( j + "occurs " + count + " time" );
        }
        else if(count>1){
            System.out.println( j + "occurs "+ count + " times");
        }
    }

}
}
*/
    static int[] arr(int[] array) {
        int x = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    x = 1;
                }
            }
            if (x == 0) {
                count++;
            }
        }
        int k = 0;
        int[] array2 = new int[count];
        for (int i = 0; i < array.length; i++) {
            x = 0;
            for (int j = i; j < i; j++) {
                if (array[i] == array[j]) {
                    x = 1;
                }
            }
            if (x == 0) {
                array2[k] = array[i];
                k++;
            }
        }
        return array2;
    }

        public static void main (String[]args){
            int[] array = {5, 9, 4, 7, 3, 56, 6, 3, 9, 4};
            int[] array2 = arr(array);
            for (int b : array2) {
                System.out.print(b + " ");
            }
        }
    }
