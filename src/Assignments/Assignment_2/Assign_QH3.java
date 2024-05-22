package Assignments.Assignment_2;
import java.util.Scanner;
public class Assign_QH3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank[] B = new Bank[5];
        double max = Integer.MIN_VALUE;
        int no = -1;
        for (int i = 0; i < 5; i++) {
            B[i] = new Bank();
            System.out.print("Enter banks Name: ");
            String s = sc.next();
            B[i].setBankName(s);
            System.out.print("Enter amount: ");
            double d = sc.nextDouble();
            B[i].setAmount(d);
            if (d > max) {
                max = d;
                no = i;
            }
        }
        for (int i = 0; i < B.length; i++) {
            B[i].showdata();
        }
        System.out.println("Total Amount: " + Bank.totalAmount);
       if(no!=-1){
           B[no].minimum();
       }
       else{
           System.out.println("No bank found!!!");
       }
    }
}

    class Bank {
        String bankName;
        double depositAmount;
        static double totalAmount;

        void setBankName(String S) {
            this.bankName = S;
        }

        void setAmount(double d) {
            double min = Integer.MIN_VALUE;
            this.depositAmount = d;
            totalAmount += depositAmount;
        }
        void minimum(){
            System.out.println("Bank with minimum amount: ");
            System.out.println("Bank Name: " + bankName);
            System.out.println("Amount: " + depositAmount);
        }

        void showdata() {
            System.out.println("Bank name: " + bankName + " " +
                    "Amount:" + depositAmount);
        }
    }

