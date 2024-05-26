package HumanCompositionCar;

public class TransportApp {
    public static void main(String[] args) {


        //ABeing brother = new Human();

        ATransport mercedes = new Car();

        Driver brother = new Driver();
        Driver father = new Driver();
        Passenger mother = new Passenger();
        Passenger sister = new Passenger();
        Dog rex = new Dog();
        Cat tom = new Cat();

        //make the JVM look at mercedes as Car
        ((Car)mercedes).setThingToPlace("Front Left", brother);
        ((Car)mercedes).setThingToPlace("Front Right", rex);
        ((Car)mercedes).setThingToPlace("Back Left", mother);
        ((Car)mercedes).setThingToPlace("Back Right", sister);

//        ((Car) mercedes).fr = brother;
       System.out.println(mercedes);
    }
}
