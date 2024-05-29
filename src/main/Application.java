package main;

import kitchen.BigCup;
import kitchen.Cupp;
import kitchen.SmallCup;

public class Application {
    public static void main(String[] args) {
        Cupp cupA  = new Cupp("Milk", 300.0);
        Cupp cupB = new Cupp("Water", 500.0);
        SmallCup smallCup = new SmallCup("Tea",200.0);
        BigCup  bigCup = new BigCup("Water",200.0);

        cupA.subVolume(50);
        System.out.println(cupA);

        cupB.addVolume(50);
        System.out.println(cupB);

        System.out.println(smallCup);

        bigCup.setLiquidVolume(cupB.getLiquidVolume());
        System.out.println(bigCup);
        cupB.setLiquidVolume(0);
        System.out.println(cupB);
    }
}
