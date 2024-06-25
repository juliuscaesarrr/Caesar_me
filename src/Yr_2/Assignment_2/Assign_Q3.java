package Assignments.Assignment_2;
import java.util.Scanner;
public class Assign_Q3 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int prodID; int qty; double price;
    Product [] P1 = new Product[5];
    for(int i = 0; i <= 5 ; i++) {
        System.out.print("ProdID: ");
        prodID = sc.nextInt();
        System.out.print("Qty: ");
        qty = sc.nextInt();
        System.out.print("Price: ");
        price = sc.nextDouble();
        P1[i] = new Product(prodID, qty, price);
    }
    for(int i = 0; i <=5 ; i++){
    P1[i].display();
        System.out.println( );
    }
    System.out.println("Total price: " +  Product.getTotalPrice());
    }
}
class Product{
    int prodID,qty; double price;
    static double totalPrice = 0;
    public Product(int prodID, int qty, double price){
        this.prodID = prodID;
        this.qty = qty;
        this.price = price;
        totalPrice += qty*price;
    }
    public static double getTotalPrice(){
        return totalPrice;
    }
    void display(){
        System.out.println("prodID: " + prodID +" " + "quantiy: "
        + qty +" " + "Price: " + price);
    }
}
