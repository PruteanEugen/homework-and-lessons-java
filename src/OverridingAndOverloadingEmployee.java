public class OverridingAndOverloadingEmployee {
    public static void main(String[] args) {
        Employee.explainYourWork();
        Developer.explainYourWork(true);
        Tester.explainYourWork();
        DevOps.explainYourWork();
    }
} class Employee{
    static void explainYourWork(){
        System.out.println(" I'm working from 9 to 5 ");
    }
    // Override o metoda din clasa mostenitoare suprascrie o metoda din clasa mostenita.
} class Developer extends Employee{
    static void explainYourWork(){
        System.out.println(" I have a flexible schedule ");

    } // Overloading - o metoda care suprascrie o metoda din cadrul aceeasi clase.
    static void explainYourWork(boolean withDetails){
        //System.out.println(" I have a flexible schedule ");
        explainYourWork();
        if (withDetails){
            System.out.println(" I'm write code in Java ");
            System.out.println(" I earn around 100$/hour ");
        }
    }
} class Tester extends Employee {
    static void explainYourWork(){
        System.out.println(" I writing the automated tests ");
    }

} class DevOps extends  Employee {
    static void explainYourWork(){
        System.out.println(" I am developing the HUP ");
    }
}

//TODO: HW1--> add 1/2 mode descendant classes