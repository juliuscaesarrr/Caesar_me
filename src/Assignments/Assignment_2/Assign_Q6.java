package Assignments.Assignment_2;

public class Assign_Q6 {
    public static void main(String[] args) {
     CSE S = new CSE(85,79,84);
     S.getPercentage();
     NonCSE O = new NonCSE(56,89,99);
     O.getPercentage();
    }
}
abstract class Marks{
    double marksICP,markDSA,percentage;
    abstract void getPercentage();
}
class CSE extends Marks{
    double algoDesign;
    CSE(double markICP,double markDSA,double algoDesign){
        this.marksICP = markICP;
        this.markDSA = markDSA;
        this.algoDesign = algoDesign;
    }
    void getPercentage(){
        System.out.println("Percentage: " + (markDSA+marksICP+algoDesign)/3);
    }
}
class NonCSE extends Marks {
    double enggMechanics;

    NonCSE(double markICP, double markDSA, double enggMechanics) {
        this.marksICP = markICP;
        this.markDSA = markDSA;
        this.enggMechanics = enggMechanics;
    }
    void getPercentage() {
        System.out.println("Percentage: " + (marksICP+marksICP+enggMechanics)/3);
    }
}