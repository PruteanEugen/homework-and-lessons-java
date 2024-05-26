//TODO HW Create a class that represents a product,
//TODO create 2/3 objects of type Product , with values entered from the kb
//todo print the values in the console
//todo how to pring object without constructions and methods ???? video 5.8
import java.util.Scanner;

public class ProductObjects {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Product_1 name: ");
        String productName1 = scanner.nextLine();
        System.out.print("Enter Product_1 price ");
        double productPrice1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter the color for Product_1: ");
        String productColor1 = scanner.nextLine();
        System.out.print("Enter the size for Product_1: ");
        float productSize1 = scanner.nextFloat();

        Product Product1 = new Product(productName1,productPrice1,productColor1, productSize1);
        System.out.println("First product " + Product1);

    }
}
class Product{
    String productName;
    double productPrice;
    String productColor;
    float productSize;

    public Product(String productName1, double productPrice1, String productColor1, float productSize) {
    }
    @Override
    public String toString() {
        return "Product{" +
                "name='" + productName + '\'' +
                ", price=" + productPrice +
                ", color=" + productColor +
                ", size="+ productSize +
                '}';
}
}