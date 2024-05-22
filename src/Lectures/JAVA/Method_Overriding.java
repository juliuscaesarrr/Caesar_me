package Lectures.JAVA;

public class Method_Overriding {
    public static void main(String[] args) {
        A a = new A();
        a.method1();
        B b = new B();
        b.method1();
        A c = new B();
        c.method1();
    }
}
class A{
    void method1(){
        System.out.println("I am boss of method A");
    }
}
class B extends A{
    @Override
    void method1(){
        System.out.println("I am boss of method B");
    }
}
