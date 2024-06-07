package Assignments.Assignment_3;
public class QH3 {
    static int s;
    static String binary(int k,String s) {
        if (k > 0) {
            if (k % 2 == 0) {
                s = "0" + s;
            } else {
                s = "1" + s;
            }
           return binary(k/2,s);
        }
        return s;
    }
    public static void main(String[] args) {
        String p = "";
        System.out.println("Binary: " + binary(8,p));
    }
}

