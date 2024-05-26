/*
 * HW1:
 *  >> Alter the code of charge(), discharge () so they don't change the charge lower than 0 and above
 *  100 %
 *  HW2:
 *  >> Alter the chargeStatus() so it output the battery status line this:
 *   battery 70 80 90%
 */
public class InharitanceAppBaterry {
    public static void main(String[] args) {
        DeviceWithBattery.charge();
//        DeviceWithBattery.discharge();
//        DeviceWithBattery.discharge();
        DeviceWithBattery.chargeStatus();
        Phone.ring();
        Robot.move();
        DeviceWithBattery.roundBatteryCharge();
    }
} class DeviceWithBattery {
    static int batteryCharge = 75;
    static int MIN_BATTERY_LEVEL = 0;
    static int MAX_BATTERY_LEVEL = 100;

    static void charge() {
        //batteryCharge += 5;
        batteryCharge = Math.min(batteryCharge, MAX_BATTERY_LEVEL);
    }

    static void discharge() {
     //   batteryCharge -= 5;
        batteryCharge = Math.max(batteryCharge, MIN_BATTERY_LEVEL);
    }

    static void chargeStatus() {
            int baterrySegments = 5;
            int filledSegments = (batteryCharge * baterrySegments / 100);                                                                                //

            for (int i=0; i < baterrySegments; i++){
                if(i<filledSegments){
                    System.out.print("▩ ");
                } else {
                    System.out.print("▢ ");
                }
            }
        System.out.println();
        System.out.println("Battery status: " + batteryCharge + " %");
    }
    public static void roundBatteryCharge() {
        int roundedCharge = (batteryCharge + 5) / 10 * 10; // Round to nearest 10
        batteryCharge = Math.min(Math.max(roundedCharge, MIN_BATTERY_LEVEL), MAX_BATTERY_LEVEL);
    }
}

    //Inheriting class
    class Phone extends DeviceWithBattery {
        static String brand = " IPHONE";

        static void ring() {
            System.out.println("Ring on " + brand);
        }
    }

    class Robot extends DeviceWithBattery {
        static float volume = 1.0f;

        static void move() {
            System.out.println(" Hey , move away, I am cleaning ");
        }
    }
