package HouseAppliances;

public class Boiler extends Appliance{
    private byte temperature;

    //polymorphism: overloading
    public Boiler(){
        super(); // it address to default constructor/ other way to address to specific constructor super(values)
        temperature = 0;
    }

    public Boiler(int powerConsumption ){
        super(powerConsumption);
    }
    public Boiler(int powerConsumption , byte temperature){
        super(powerConsumption);
        setTemperature(temperature);

    }
    public byte getTemperature(){
        return temperature;
    }
    public void setTemperature(byte temperature){

        this.temperature = temperature;
    }
}
