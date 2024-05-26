package HouseAppliances;

public abstract class Appliance {
    //Encamspulation
    private int powerConsumption;

    //Default Constrator
    public Appliance(){
        powerConsumption = 0;
    }
    public Appliance(int powerConsumptions){
        setPowerConsumptions(powerConsumptions);
    }

    //Getters and Setters
    public int getPowerConsumption(){
        return powerConsumption;
    }
    public void setPowerConsumptions(int powerConsumptions){
        if(powerConsumption < 1 || powerConsumptions > 10_000){
            System.out.println("The power should be between 1..10000 wats");
        }else {
        this.powerConsumption = powerConsumption;}
    }
}
