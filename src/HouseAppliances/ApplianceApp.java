package HouseAppliances;

public class ApplianceApp {
    public static void main(String[] args) {

        Boiler boiler = new Boiler(); //default Construtor
        System.out.println(boiler.getPowerConsumption());
        System.out.println(boiler.getTemperature());
    }
}
