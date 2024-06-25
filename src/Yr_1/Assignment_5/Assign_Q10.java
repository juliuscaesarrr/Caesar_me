package Assignment_5;

public class Assign_Q10 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 1;
        int n = 10;
        for (int i = 3; i <= n; i++) {
            int sum = a + b + c;
            System.out.print(sum + " ");
            a = b;
            b = c;
            c = sum;
        }
    }
}

