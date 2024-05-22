package Assignments.Assignment_3;

public class QH1 {
    public static int GCD(int k,int n) {
        if (n != 0) {
          int r = k % n;
            k = n;
            n = r;
            return GCD(k, n);
        }
        return k;
    }
    public static void main(String[] args) {
        System.out.println(GCD(72,86));
    }
}
