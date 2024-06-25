package Assignment_6;
import java.util.Scanner;
public class alLassignments {
    //Q1:-
/*static void additionSimple(int x, int y){
      System.out.println(x + " + " + y +  " = " + (x+y));
  }
  static void subtractionSimple(int x, int y){
    System.out.println(x + " - " + y + " = " + (x-y));
  }
  static void multiplicationSimple(int x, int y){
    System.out.println(x + " * " + y + " = " + (x*y));
  }
  static void divisonSimple(int x, int y){
    System.out.println(x + " / " + y + " = " +(double)(x/y));
  }
  static void remainderSimple(int x, int y){
   if(x!=0){
    System.out.println(x + " % " + y + " = " + (x%y));
   }
  }
  static void squarerootSimple(int n){
    if(n>0){
        System.out.println(n + "^" + "2 " + " = " +(Math.pow(n,2)));
    }
  }

public static void main(String[] args) {
    additionSimple(5, 7);
    subtractionSimple(9, 5);
    multiplicationSimple(5, 30);
    divisonSimple(8, 2);
    remainderSimple(4, 3);
    squarerootSimple(5);
}
*/
//Q2:-
  /*static int getPentagonalNumber(int x){
    int z = 1;
    for(int i = 1; i <= x ; i++){
          z  = i*(3*i-1)/(2);
          System.out.print(z + "\t");
        }
        return z;
}
  public static void main(String[] args) {
   getPentagonalNumber(100);
  }
*/
//Q3:-
   /* static int reverse(int x) {
        int y = 1;
        int reverse = 0;
        while (x != 0) {
            y = x % 10;
            reverse = reverse * 10 + y;
            x = x / 10;
        }
        return reverse;
    }

    static boolean ispalindrome(int x) {
        return x ==
                reverse(x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (ispalindrome(a)) {
            System.out.println("Yes it is a Palindrome!!!");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}*/
//Q4:-
 /*
 static int numberofdaysinaYear(int x){
    int z = 365;
    if(x % 4 == 0 && x % 100 != 0 || x % 400 == 0){
        z = 366;
    }
    return z;
 }
 public static void main(String[] args) {
    for( int i = 2000 ; i <= 2020 ; i++){
       System.out.println("The number of days in the year " + i +
      " is:- " + numberofdaysinaYear(i));
    }
 }
*/
//Q5:-
 /*
 static double area(int n, double s){
    int x = (int) ((n*s*s)/( 4*Math.tan(Math.PI/4)));
      return x;
 }

public static void main(String[] args) {
  System.out.println("The area of the polygon is:- " + area(4,20));
}
*/
//Q6:-
/*
    static int count(String str, char a){
        int count = 0;
        for(int i = 0 ; i < str.length() ; i++){
            if(a==str.charAt(i)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(count("hello", 'l'));

    }
*/
//Q7:-
/*
    static int count(String str){
        char [] vowels ={'a','e','i','o','u'};
        int count = 0;
        for(int x : vowels){
            for(int i = 0 ; i < str.length(); i++){
                if( x == str.charAt(i)){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(count("apple"));
    }
*/

    //Q8:-
/*
    static void count(String str) {
        int x = 0;
        int l = str.length();
        for (int i = 0; i < l / 2; i++) {
            if (str.charAt(i) != str.charAt(l - i - 1)) {
                x = 1;
            }
        }
        if (x ==0) {
            System.out.println("Yes it is a palindrome!!");
        } else {
            System.out.println("It is not a palindrome!!");
        }
    }

    public static void main(String[] args) {
        count("heleh");
    }
    }
*/
    public static void main(String[] args) {
        System.out.println(78>>>4);
        System.out.println(4^6);
    }
}



























































































