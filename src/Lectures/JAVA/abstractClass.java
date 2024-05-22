package Lectures.JAVA;

public class abstractClass {
    public static void main(String[] args) {
       Child C = new Child();
       C.Parent1();
       // In abstarct class me final nhi h change karne se change
        // hota haii
       C.l=75;
        System.out.println(C.l);
    }
}
abstract class Parent{ // iska object nhi bana skte
    abstract public void Parent1();
}
class Child extends Parent{
    public void Parent1(){
        System.out.println("hello");
    }
    int l =20;
}
abstract class Parent2 extends Parent{ // isko bulaega kese lawde pata nhi
    public void Parent1(){
        System.out.println("I am from abstract class");
    }
}
