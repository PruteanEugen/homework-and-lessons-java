package Fruit.example.juice;

public class Apple extends Fruit {


    public Apple (int weight){
        //delegation from the Fruit constructor
        super(weight);
        usefull = 80;
    }
    public void printVitamins(){
        System.out.println("Vitamin B-complex");
    }
}
