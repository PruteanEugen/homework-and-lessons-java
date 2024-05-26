package array.examples;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StudentDatabase.students = new Student[3];
        int option;
        while (true){
            option = ConsoleUI.printMenu();
            //TODO HW6 Rewrite the code with the switch;
            //TODO HW7 ADD the rest of the options;
            if(option == 1 ){
                        StudentDatabase.printAllStudents();
                    } else if (option == 2) {
                        System.out.println("Enter student's data: ");

                        StudentDatabase.addStudent(in.nextLine(),in.nextLine(), in.nextInt());

                    }
        }
//        System.out.println("Enter students's 1 date: ");
//        StudentDatabase.addStudent(in.nextLine(),in.nextLine(), in.nextInt());
//        in.nextLine();
//        System.out.println("Enter students's 2 date: ");
//        StudentDatabase.addStudent(in.nextLine(),in.nextLine(), in.nextInt());
//        in.nextLine();
//        System.out.println("Enter students's 3 date: ");
//        StudentDatabase.addStudent(in.nextLine(),in.nextLine(), in.nextInt());
//        in.nextLine();
//        System.out.println("Enter students's 4 date: ");
//        StudentDatabase.addStudent(in.nextLine(),in.nextLine(), in.nextInt());
        //TODO HW1: modify the scanning code so it accepts more than 1 word (FULL name)
        // hint : nextInt()
//        StudentDatabase.printAllStudents();
//        //StudentDatabase.updateStudent(1,"Change Name", "Other group",2);
//        StudentDatabase.deleteStudent(1);
//        StudentDatabase.printAllStudents();
    }
}
class ConsoleUI{
    public static int printMenu(){
        System.out.println("MENU");
        System.out.print("1. To view students list \n2. Add student \n");
        System.out.println(">> ");
        Scanner in = new Scanner(System.in);
        int option = in.nextInt();
        return option;
    }
}
class StudentDatabase{
    public static Student [] students;
    public static int lastIndex = 0;

    public static void addStudent(String fullName, String grouptName,int generalGrade){
        //TODO HW3 make sure no exception appears here
        /*TODO hint: maybe allocate more cells???*/

        if(lastIndex < students.length){
        students[lastIndex] = new Student(fullName,grouptName,generalGrade);
        lastIndex++;
        }else {
            System.out.println("Can not add student: The array is full");
        }
    }
    public static void printAllStudents() {
        System.out.println("\nStudent list: ");
        //TODO don't print the null values;
        for (Student student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }
    //TODO HW4 Make variantions for updateStudent (overloading)
    public static void updateStudent(int index, String fullName, String groupNmae, int generalGrade){
        students[index].setFullName(fullName);
        students[index].setGroupName(groupNmae);
        students[index].setGeneralGrade(generalGrade);
    }
    public static void deleteStudent(int index){
    Student [] newStudents = new Student[students.length -1];
    for (int i =0, j=0; i<students.length; i++,j++){
        //TODO HW5 Make this if() more compact.
        if(i==index){
            i++;
        }
        newStudents[j] = students[i];
    }
    students = newStudents;
    }
}


//dynamic / non-static
class Student{
    private String fullName;
    private String groupName;
    private int generalGrade;

    public Student(String fullName, String groupName, int generalGrade) {
        this.fullName = fullName;
        this.groupName = groupName;
        this.generalGrade = generalGrade;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getGeneralGrade() {
        return generalGrade;
    }

    public void setGeneralGrade(int generalGrade) {
        this.generalGrade = generalGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", groupName='" + groupName + '\'' +
                ", generalGrade=" + generalGrade +
                '}';
    }
}
