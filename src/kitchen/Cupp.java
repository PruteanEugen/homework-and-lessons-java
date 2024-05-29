package kitchen;//TODO Sa presupunem ca avem clasa unei "cani" Cup care este caracterizata prin 2 proprietati:
//
//liquidName - denumirea lichidului din interior
//liquidVolume - volumul lichidului din interior in ml
//Se cere:
//
//alegeti tipurile "TypeA" si "TypeB" astfel incat clasa sa corespunda descrierii de mai sus
//INTERBARE - Se aplica oare capsula asupra acestei clase?
//Adaugati set/get pentru fiecare proprietate luand in consideratie ca:
//In canile acestei clase poate fi turnat doar "Water", "Milk","Tea"
//Volumul lichidului nu poate depasi 600ml si nu poate fi negativ!
//Plasati clasa "Cup" in package "kitchen" iar in package "main" creati clasa "Application" cu metoda "main()"
//In "Application / main()" creati doua obiecte de tip "cana":
//cupA = cu 300 ml lapte
//cupB = cu 500 ml apa
//varsati 50 ml de lapte din cana "cupA"
//adaugati inca 50ml de apa in cana "cupB"
//afisati in consola informatia despre "cupA" si "cupB"
//ATENTIE - in codul clasei "Cup" tre sa existe doar metodele si proprietatile mentionate, nimic in plus!!!

public class Cupp {

    private String liquidName;
    private double liquidVolume;


    public Cupp() {

    }

    public Cupp (String liquidName, double liquidVolume) {
        setLiquidVolume(liquidVolume);
        setLiquidName(liquidName);
    }

    public double getLiquidVolume() {
        return liquidVolume;
    }

    public void setLiquidVolume(double liquidVolume) {
        if (liquidVolume < 0 || liquidVolume > 600) {
            System.out.println("Error: liquidVolume must be between 0 and 600");
        }
        this.liquidVolume = liquidVolume;
    }

    public String getLiquidName() {
        return liquidName;
    }

    public void setLiquidName(String liquidName) {
        if (liquidName == null || !liquidName.equals("Water") && !liquidName.equals("Milk") && !liquidName.equals("Tea")) {
            throw new IllegalArgumentException("Invalid liquid name. Only 'Water', 'Milk', or 'Tea' are allowed.");
            } else {
        this.liquidName = liquidName;
        }

    }
    public void addVolume(int amount) {
        if (amount<0){
            throw new IllegalArgumentException("Amount to add cannot be negative.");
        }
        this.liquidVolume += amount;
    }
    public void subVolume(int amount) {
        if (amount<0){
            throw new IllegalArgumentException("Amount to submit cannot be negative.");
        }
        if (amount > this.liquidVolume) {
            throw new IllegalArgumentException("Not enough liquid volume to substract.");
        }
        this.liquidVolume -= amount;
    }

    @Override
    public String toString() {
        return "Cupp{" +
                "liquidName='" + liquidName + '\'' +
                ", liquidVolume=" + liquidVolume +
                '}';
    }
}



// ??? +set/+get
