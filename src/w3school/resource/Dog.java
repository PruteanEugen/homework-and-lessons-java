package w3school.resource;

/*TODO
2. Write a Java program to create a class called "Dog" with a name and breed attribute.
Create two instances of the "Dog" class, set their attributes using the constructor and modify
the attributes using the setter methods and print the updated values. */

public class Dog {
    private String name;
    private String breed;

    public static void main(String[] args) {
        Dog dog = new Dog("Rex","Haski");
        dog.setName("Leo");
        dog.setBreed("mountain dog");
        System.out.println("The dog name: " + dog.getName() + ", Breed " +dog.getBreed());

    }
    public Dog(){}
    public Dog(String name, String breed) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}
