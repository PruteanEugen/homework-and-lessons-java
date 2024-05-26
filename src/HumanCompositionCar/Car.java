package HumanCompositionCar;

public class Car extends ATransport {

    private Driver fl; //driver

    private ITransportable fr;
    private ITransportable bl;
    private ITransportable br;

    public ITransportable getThingFromPlace(String place) {
        if (place.equals("Front Left")) {
            return fl;
        }
        if (place.equals("Front Right")) {
            return fr;
        }
        if (place.equals("Back Left")){
            return bl;
        }
        if (place.equals("Back Right")){
            return br;
        } return null;
    }
    public void setThingToPlace(String place,ITransportable thing){
        if (place.equals("Front Left")){
            fl = (Driver)thing; //downcasting
        }
        if (place.equals("Front Right")){
            fr = thing;
        }
        if (place.equals("Back Left")){
            bl = thing;
        }
        if (place.equals("Back Right")){
            br = thing;
        }
    }


    public String toString(){
        String out =

                "+------------Object<Car>--------------+\n"+
                "|                                     |\n"+
                "|                                     |\n"+
                "|                                     |\n"+
                "|   +----+              +----+        |\n"+
                "|   |"+fl+"|              |"+fr+"|        |\n"+
                "|   +----+              +----+        |\n"+
                "|                                     |\n"+
                "|                                     |\n"+
                "|   +----+              +----+        |\n"+
                "|   |"+bl+"|              |"+br+"|        |\n"+
                "|   +----+              +----+        |\n"+
                "|                                     |\n"+
                "|                                     |\n"+
                "+------------Object<Car>--------------+";
        return out;
 }
}

