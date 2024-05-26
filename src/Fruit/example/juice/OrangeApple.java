package Fruit.example.juice;

public class OrangeApple extends Fruit {

    public OrangeApple (int weight){
        //delegation from the Fruit constructor
        super(weight);
        usefull = 100;}
    @Override
    public void printVitamins() {
        System.out.println("C and B-complex");
    }
}
