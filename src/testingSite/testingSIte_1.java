package testingSite;

public class testingSIte_1 {
    public static int a(int k) {
        if (k != 0 || k != 1)
            return k * a(k - 1);
        else
            return 1;
    }
    public static void main(String[] args) {
        System.out.println(a(5));
    }
}