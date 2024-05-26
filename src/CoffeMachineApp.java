public class CoffeMachineApp {
    public static void main(String[] args) {
        //1. Let's get ourselves a coffee machine
        CoffeeMachine homeCoffeeMachine = new CoffeeMachine();


        //2. Let's pour some coffee
        Container cup = new Container();

        //3. Let's create a container object
        homeCoffeeMachine.pour(cup);


        //4. Let's check the coffee in the cup
        System.out.println("The cup contains " + cup.getVolume()+" L of coffee");
        System.out.println("Is the cup full? " +cup.isFull());
    }
} class CoffeeMachine{

    // Inherited default constructor --> CoffeeMachine(){}
    CoffeeMachine(){

    }
    void pour(Container container) {
        while (!container.isFull()){
            System.out.println(container.getVolume());
            container.setVolume(container.getVolume()+0.01f);
    }
    }
}
 class Container {
    //TODO HW2: Refactor MAx_VOLUME , volume so them will becomes integers.
    final float MAX_VOLUME = 0.200f; //0.2L
    private float volume   = 0.0f;

    //Encasulation Getters and Setters

    public float getVolume(){
        return volume;
    }
    public void setVolume(float volume){
        if (volume < 0 || volume > MAX_VOLUME){
        System.out.println("WRONG VOLUME");
        } else {
            this.volume = volume;
        }
    }
    boolean isFull () {
        return volume >= MAX_VOLUME * 0.95f;
    }
}
class Cup extends Container{

}
class Teapot extends Container{

}

//TODO HW with cup of tea!!!!!!!!!!!!!!!!!!!!!!!!!!!!!