package world;

public class Liquid {
    private String name;
    private int volume;
    private double temperature;

    public Liquid (){}
    public Liquid (String name, int volume, double temperature){
            setName(name);
            setVolume(volume);
            setTemperature(temperature);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == ""){
            throw new IllegalArgumentException("The name can't be empthy");
        }
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if(volume<=0){
            throw new IllegalArgumentException("The Volume can not be negative or equal to 0");
        }
        this.volume = volume;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        if (temperature < 0 || temperature > 100){
            throw new IllegalArgumentException( " The temperature should be between 0..100");
        }
        this.temperature = temperature;
    }
    public boolean isCold(){
        if(temperature <= 18){
            return true;
        } else {
            throw new IllegalArgumentException("Iligal temperature");

        }
    }
    public boolean isHot(){
        return temperature > 36;
    }
    public boolean isWarm(){
        return temperature > 18 && temperature<= 36;
    }
}
