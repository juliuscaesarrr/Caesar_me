package Assignments.Assignment_2;

public class Assign_QH4 {
    public static void main(String[] args) {
    Distance D1 = new Distance(15,5);
    Distance D2 = new Distance(15,5);
    D2.sum(D1,D2);
    D2.display();
    }
}
class Distance{
    int m,cm;
    Distance(int m, int cm){
        this.m = m;
        this.cm = cm;
    }
    void sum(Distance D1,Distance D2){
       m = D1.m + D2.m;
       cm = D1.cm + D2.cm;
    }
    void display(){
        System.out.println(m + " + " + cm);
    }
}

