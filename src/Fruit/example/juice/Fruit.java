package Fruit.example.juice;

abstract public class Fruit {
    int usefull = 0;
    private int weight;

    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public Fruit() {
    }

    public Fruit(int weight) {
        this.weight = weight;
    }
   abstract public void printVitamins();
}