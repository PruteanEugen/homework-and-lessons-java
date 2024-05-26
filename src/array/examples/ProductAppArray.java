package array.examples;

import java.util.Scanner;

public class ProductAppArray {
    public static void main(String[] args) {
//        Product p1 = new Product("Pizza" , 100.0f, 1); //Obiect
//        System.out.println(p1);
//        Product [] order = {
//                new Product ("Pizza", 100.0f, 1),
//                new Product ("Salad", 50.0f, 1),
//                new Product ("Tea", 30.0f, 1),
//        };
        Product [] order;
        Scanner in = new Scanner(System.in);

        System.out.print("How many items would you order?:");
          int totalItems = in.nextInt();
          in.nextLine();
        //alocate memory for the array
        order = new Product[totalItems];//5 // [null, null, null, null, null]


        System.out.println("Please complete the order data: ");
        //  standard for
        for (int i=0; i < order.length; i++){
            System.out.print("Product "+ (i+1)+":");
            String name = in.next();
            float price = in.nextFloat();
            int quantity = in.nextInt();
            in.nextLine();
            order[i] = new Product(name, price, quantity);
        }
        System.out.println("\nYou ordered: ");
        for (Product product : order){
            System.out.println(product);
        }
        in.close();
    }
}
    class Product{
    public String name;
    public float price;
    public int quantity;

    public Product(String name, float price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String toString(){
        return "Product [name=" + name +", price="+ price+", quantity=" +quantity+ "]";
    }
}
//
//package array.examples;
//
//import java.util.Scanner;
//
//public class ProductAppArray {
//    public static void main(String[] args) {
//        Product[] order;
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("How many items would you order?: ");
//        int totalItems = in.nextInt();
//        in.nextLine(); // Consume the newline character
//
//        // Allocate memory for the array
//        order = new Product[totalItems]; // [null, null, null, null, null]
//
//        System.out.println("Please complete the order data: ");
//        // Standard for loop
//        for (int i = 0; i < order.length; i++) {
//            System.out.print("Product " + (i + 1) + " (name price quantity): ");
//            String name = in.next();
//            float price = in.nextFloat();
//            int quantity = in.nextInt();
//            in.nextLine(); // Consume the newline character after reading int
//            order[i] = new Product(name, price, quantity);
//        }
//
//        System.out.println("\nYou ordered: ");
//        for (Product product : order) {
//            System.out.println(product);
//        }
//        in.close(); // Close the scanner
//    }
//}
//class Product {
//    public String name;
//    public float price;
//    public int quantity;
//
//    public Product(String name, float price, int quantity) {
//        this.name = name;
//        this.price = price;
//        this.quantity = quantity;
//    }
//
//    @Override
//    public String toString() {
//        return "Product [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
//    }
//}
//
//
