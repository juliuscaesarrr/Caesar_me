package JAVA;

public class Methods {
    /*    static int logic (int x,int y){
            int z ;
            if(x>y){
                z = x + y ;
            }
            else{
                z = x * y;
            }
            return z;
        }

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c;
        //if not using static to call obj so,
        // Methods obj = new Methods();
        // c = obj.logic(a,b);
        c = logic(a,b);
        int p = 4;
        int q = 3;
        int s;
        s = logic(p,q);
        System.out.println(c);
        System.out.println(s);
      */

    //Void return type
   /*
    static void Type() {
        System.out.println("I am gonna be the most powerful person in the world!!");
    }

    public static void main(String[] args) {
        Type();
    */
  /*static int me(int x , int y) {
      int z = x + y;
      return z;
  }
  static int me(int x, int y, int z){
      int p = x + y + z;
      return p;
  }
  static int me(int...arr){
      int sum = 0;
      for(int h : arr){
          sum+=h;
      }
      return sum;
  }

    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int k;
        k = me(x,y);
        System.out.println(k);
        int j = me(x,y,k);
        System.out.println(j);
        int q = me(x,y,k,j);
        System.out.println("sum is:- " + me(4,5,6,8,8,2,6,8,8,9,5,8,4));
  */
    //Q1:-
    /*static int multiplication(int x) {
        int multi = 1;
        for (int i = 1; i <= 10; i++) {
            multi = i * x;
            System.out.println(x + " X " + i + " = " + multi);
        }
        return multi;
    }

    public static void main(String[] args) {
        int k = multiplication(5);
    }
}
*/
//Q2:-
 /*static void print(){
 for(int i = 1 ; i <= 5 ; i++) {
     for (int j = 1; j <= i; j++) {
         System.out.print("*" + " ");
     }
     System.out.println(" ");
 }
 }

    public static void main(String[] args) {
        print();
    }
}
*/
//Q4:-
    /*static void print() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("@" + " ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
     print();
    }
}
*/
//Q6:-
/*static int avg(int...arg){
    int sum = 0;
    for( int a : arg ){
          sum += a;
      }
   int avgg = (sum/arg.length);
    return avgg;
}

    public static void main(String[] args) {
        System.out.println("The avg is:- " + (double)avg(5,4,3,2,1));
    }
*/



 // VARARIABLE ARGUMENTS
  /*      public static int sum(int...arr){
            //available as int [] arr
            int result = 0;
            for(int a : arr){
                result+=a;
            }
            return result;
        }

    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4,5,6,7));
        System.out.println(sum(5,7,9,6,4,5,4,1));
    }
}
*/


// RECURSION
/*
static int factorial(int k){
if(k==1 || k==0){
    return 1;
}
else{
    return (k * factorial(k-1));
}
}

    public static void main(String[] args) {
        System.out.println("The factorial of 4: "+factorial(4));
    }
}
*/
static String fibona(int a,int b){
    return fibona(b,a+b);
}

    public static void main(String[] args) {
        System.out.print(fibona(0,1) + " ");
    }
}














































