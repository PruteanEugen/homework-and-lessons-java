package w3school.resource;
//TODO 3. Write a Java program to create a class called
// "Rectangle" with width and height attributes. Calculate the area and perimeter of the rectangle.

public class Rectangle {
    private int width;
    private int height;

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3,4);
        System.out.println("The area of the rectangle = " + rectangle.getArea() + " cm2");
        System.out.println("The parameter of the rectangle = " +rectangle.getPerimeter());
    }

    public Rectangle() {
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getArea() {
        return width * height;
    }
    public int getPerimeter() {
        return width + height;
    }
}
