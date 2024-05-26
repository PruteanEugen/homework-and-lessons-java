package Fruit.example.juice;

public class FruitApp {
    public static void main(String[] args) {
        // Create a Blender object
        Blender portableBlender = new Blender();

        //Create a few fruit objects
        Fruit smallApple = new Apple(50);
        Fruit bigApple = new Apple(200);

        Fruit smallOrange = new Orange(30);
        Fruit bigOrange = new Orange(500);


        Fruit apple = new Apple(50);
        Fruit orange = new Orange(100);
        Fruit orangeApple = new OrangeApple(300);
        apple.printVitamins();
        orange.printVitamins();
        orangeApple.printVitamins();

        //Let's dry blend
        Juice smallAppleJuice = portableBlender.blend(smallApple);
        System.out.println(smallAppleJuice.volume);
    }
}
