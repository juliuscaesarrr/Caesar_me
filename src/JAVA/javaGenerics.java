package JAVA;

public class javaGenerics {
    public static<t> void gen(t l){
        System.out.println(l);
    }
    public static void main(String[] args) {
        Integer a=5;
       gen(a);
    }
}
/*class Gen<g> {
    int data;
    g G1;

    public Gen(int data, g G1) {
        this.data =data;
        this.G1 =G1;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public g getG1() {
        return G1;
    }

    public void setG1(g G1) {
        this.G1 = G1;
    }
}

public class Generics {

    public static void main(String[] args) {
        Gen<Integer> g = new Gen(23,7);
        Integer b = g.getG1();
        System.out.println(b);
    }
}*/