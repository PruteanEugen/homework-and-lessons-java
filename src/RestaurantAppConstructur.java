public class RestaurantAppConstructur {
    public static void main(String[] args) {
        //2. Create a Food instance and initialization
        Food f1 = new Food("Salad" , 2000, true );
        Drink d1 = new Drink("Wine","alcool",1);
        System.out.println(d1);

        //3. Initialization
//        f1.name = "Salad";
//        f1.price = 1000; // 10 euro
//        f1.available = true;

        //4. Usage
        System.out.println(f1.name);
        System.out.println(f1.price);
        System.out.println(f1.available);
    }
    // 1. Class definistion
} class Food {
    String name;
    int price;
    boolean available;

    //Constructor
    Food (String name, int price, boolean available) {
        this.name = name;
        this.price = price;
        this.available = available;
        //System.out.println("A new food object was created");
    }
} class Drink{
    String name;
    String category;
    int volume;

    Drink(String name, String category, int volume){
        this.name = name;
        this.category = category;
        this.volume = volume;
    }
}
