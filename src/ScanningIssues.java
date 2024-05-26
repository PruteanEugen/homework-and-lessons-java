import java.util.Scanner;

public class ScanningIssues {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = in.next();

        System.out.println("Enter age: ");
        int age = in.nextInt();

        System.out.println("|%s| |%d|");
    }
}
