import java.util.Scanner;

public class OopNonStaticButDynamic {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.fullName = "Borea Cibotar";
        s1.avgGrade = 4.1;
        System.out.println(s1.fullName);
        System.out.println(s1.avgGrade);

        Student s2 = new Student();
        s2.fullName = "Grigore Stati";
        s2.avgGrade = 6.2;
        System.out.println(s2.fullName);
        System.out.println(s2.avgGrade);
    }

} class Student {
     String fullName;
     double avgGrade;
}
 //TODO HW Create a class that represents a product,
//TODO create 2/3 objects of type Product , with values entered from the kb
//todo print the values in the console
