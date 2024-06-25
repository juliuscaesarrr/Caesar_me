package Assignments.Assignment_3;

public class QH4 {
    static int product(int k,int n){
        if(n!=0){
            return k + product(k,n-1);
        }
        else
            return 0;
    }
    public static void main(String[] args) {
        System.out.println(product(5,3));
    }
}
