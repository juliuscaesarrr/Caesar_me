package Assignments.Assignment_2.Assign_Q8.Q1;

class Student{
    public String name;
    public int roll;
    public void inputDetails(String s,int r){
        this.name = s;
        this.roll = r;
    }
    public void showDetails(){
        System.out.println("NAME : " + name);
        System.out.println("ROll: " + roll);
    }
}
public class Test extends Student {
    public double mark1,mark2;
    public void inputDetails(String s,int r ,double mark1 , double mark2){
        super.inputDetails(s,r);
        this.mark1 = mark1;
        this.mark2 = mark2;
    }
    public void showDetails(){
        System.out.println("NAME: " + name);
        System.out.println("ROLL: " + roll);
        System.out.println("MARK 1: " + mark1);
        System.out.println("MARK 2: " + mark2);
    }
}

