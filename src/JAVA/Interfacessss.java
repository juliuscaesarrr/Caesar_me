package Lectures.JAVA;

public class Interfacessss implements Car{
    public static void main(String[] args) {
   Interfacessss i = new Interfacessss();
        i.applybreak(96);
        i.speedUP(20);
        i.blowHorn();
        System.out.println(i.c);
        // In interfaces the properties are final you can not reasign
        //i.c = 20;
    }

    @Override
    public void applybreak(int decrement) {
        System.out.println("Speed reduced!!!");
    }

    @Override
    public void speedUP(int increment) {
        if(increment>100) {
            System.out.println("Speed increased!!!");
        }}
    public void blowHorn(){
        System.out.println("PEE..peee...peee");
    }
}
interface Car {
    int c = 69;
   void applybreak(int decrement);
   void speedUP(int increment);
}