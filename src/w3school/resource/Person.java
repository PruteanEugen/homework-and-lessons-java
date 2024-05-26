package w3school.resource;
//TODO 1. Write a Java program to create a class called "Person" with a name and age attribute.
// Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.
//TODO

public class Person {
    private int age;
    private String name;
    public static void main(String[] args) {
     Person person = new Person("Felix",30);
     System.out.println(person.getName()+" "+person.getAge());

    }

    public Person(){}
    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
