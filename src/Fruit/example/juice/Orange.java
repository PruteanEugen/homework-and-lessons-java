package Fruit.example.juice;

public class Orange extends Fruit{

    public Orange (int weight){
        //delegation from the Fruit constructor
        super(weight);
        usefull = 90;
    }
    public void printVitamins(){
        System.out.println("Vitamin C");
    }
}
