package w3school.resource;

// TODO Write a Java program to create a class called "Circle" with a radius attribute.
//  You can access and modify this attribute. Calculate the area and circumference of the circle
public class Circle {
    private double radius;

    public static void main(String[] args) {
        Circle circle = new Circle(2.0);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculateCircumference());
    }
    public Circle(){}
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}
