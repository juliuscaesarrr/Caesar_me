package Assignments.Assignment_3;

public class QH6 {

    public static boolean isPalindrome(String s){
        return (s.equals(reverse(s,s.length() - 1)));
    }
    static String reverse(String s,int k){
        if(k>-1){
            return s.charAt(k) + reverse(s,(k-1));
        }
        else return "";
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("ccccc"));
    }
}

