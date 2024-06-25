package Assignment_5;

public class Assign_Q8 {
    public static void main(String[] args) {
        int n = 3;
        int sum = 0;
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                sum = sum + j;
            }
        }
        System.out.println(sum);
    }
}
