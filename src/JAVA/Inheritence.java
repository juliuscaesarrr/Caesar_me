package Lectures.JAVA;

public class Inheritence {
    public static void main(String[] args) {
    Employee E1 = new Employee("Kanha",15,14,36);
    E1.display();
    }
}
class Person{
    int age ; String name;
   public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}
class Employee extends Person{
    int Eid; double Salary;
    Employee(String name, int age, int Eid, double Salary){
        super(name,age);
        this.Eid = Eid;
        this.Salary = Salary;
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(Eid);
        System.out.println(Salary);
    }
}

//Questions:

