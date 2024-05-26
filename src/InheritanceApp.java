public class InheritanceApp {
    public static void main(String[] args) {
        Phone.charge();
        Phone.discharge();
        Phone.discharge();
        Phone.chargeStatus();
    }
       ///#################### HIERARCHY  ###########################
    // BASE / Super / Superioara // parent Class
    class DeviceWithBattery {
        static int baterryCharge = 125;

        static void charge() {
            baterryCharge += 5;
        if (baterryCharge > 100) {
            System.out.println(" Baterry is above 100%");}
        }
        static void discharge() {
            baterryCharge -= 5;
            if (baterryCharge < 0) {
                System.out.println(" Baterry is below 0%");
            }
        }
        static void chargeStatus() {
            System.out.println("Battery: " + baterryCharge + " %");
        }
    }
    ///Inheritance Class
    class Phone extends DeviceWithBattery {
        static String brand = "Samsung";
        static void ring(){
            System.out.println("Brrring Briinnng");
        }
    }
    class Robot extends DeviceWithBattery {
        static float volume = 1.0f;
        static void move(){
            System.out.println("Hey, move away! I'm clinnnin g== ");
        }

    }
}

/*
 * HW1:
 *  >> Alter the code of charge(), discharge () so they don't change the charge lower than 0 and above
 *  100 %
 *  HW2:
 *  >> Alter the chargeStatus() so it output the battery status line this:
 *   batteru 70 80 90%
 */
