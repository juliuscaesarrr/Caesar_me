package Assignments.Assignment_3;

public class QH3 {
    static int binaryFinder(int k) {
        if (k > 0) {
            System.out.print(k%2);
            return binary(k / 2);
        } else {
            return 0;
        }
    }
    static int binary(int k)
    {
        return 1;
    }
    public static void main(String[] args) {
        binary(8);
    }
}
