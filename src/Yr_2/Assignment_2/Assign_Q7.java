package Assignments.Assignment_2;

public class Assign_Q7 {
    public static void main(String[] args) {
        Person7 p = new Person7();
        p.display("Kanha");
        System.out.println("No.of characters: " + p.count());
    }
}
interface DetailInfo{
    public void display(String s);
    public int count();
}
class Person7 implements DetailInfo{
    static int maxcount = 0;
    String name;
    public void display(String s){
        this.name = s;
        System.out.println("NAME : " + name);
    }
    public int count(){
        for(int i = 0 ; i < name.length() ; i++){
            maxcount++;
        }
        return maxcount;
    }
}