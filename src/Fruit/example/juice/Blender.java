package Fruit.example.juice;

public class Blender {
    public Juice blend (Fruit fruit) {
        // fruit <--- weight

        Juice juice = new Juice( fruit.getWeight() * fruit.usefull /100);
        return juice;
    }
}
