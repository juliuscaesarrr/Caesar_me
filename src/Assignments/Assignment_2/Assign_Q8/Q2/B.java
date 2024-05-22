package Assignments.Assignment_2.Assign_Q8.Q2;
import Assignments.Assignment_2.Assign_Q8.Q1.*;
public class B implements Sports {
    public static void main(String[] args) {
        Test T = new Test();
        T.inputDetails("KANHA", 21, 69, 39);
        T.showDetails();
        System.out.println("Total marks: " + (T.mark1+T.mark2
        +score1+score2));
    }
}
interface Sports{
    double score1 = 69;
    double score2 = 39;
}
