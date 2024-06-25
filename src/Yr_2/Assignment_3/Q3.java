package Assignments.Assignment_3;
import java.util.Scanner;
class MarkOutOfBoundsException extends Exception{
    public String toString(){
        return super.toString() + " HEllO";
    }
}
class Student{
    int mark;
    String name;
    void getName(){
        Scanner sc = new Scanner(System.in);
        try{
            int a = sc.nextInt();
            if(a>100){
                throw new MarkOutOfBoundsException();
            }
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }

}
public class Q3 {
    public static void main(String[] args) {
        Student S = new Student();
        S.getName();
    }
}
