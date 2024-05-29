package kitchen;

public class BigCup extends Cupp{
    public BigCup() {}
    public BigCup(String liquidName, double liquidVolume){
        super(liquidName,liquidVolume);
    }
    public void setLiquidVolume(double liquidVolume){
        if (liquidVolume<0 || liquidVolume>1000){
            throw new IllegalArgumentException("Volume must be between 0 and 250");
        } else {
            super.setLiquidVolume(liquidVolume);
        }
    }
}
