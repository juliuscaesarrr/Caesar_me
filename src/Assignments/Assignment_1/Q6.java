package Assignments.Assignment_1;

public class Q6 {
    public static boolean isOdd(int n){
        return (n&1)==1;
    }
    public static void main(String[] args) {
        System.out.println(isOdd(3));
    }
}
