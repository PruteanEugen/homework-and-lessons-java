//DEV B - logic of the game
public class EncapsulationPlayer {
    public static void main(String[] args) {
        Player.setHealth((byte) 70);
        System.out.println( "hp left: " + Player.getHealth());
    }
     //TODO HW1: image the player has 100 hp and you must substract the 30 points
    //Encasulation  inner/outer logic of the class
    // Provider and Consumer
    // access

// DEV A - player logic
} class Player{
    private static byte health = 100; //100hp  // private -- access modifier

    static void setHealth (byte h){
        if ( h < 0 || h > 100){
            System.err.println(" ERROR: can not set the health outside 0..100 range!!!");
        } else {
         health = h;
        }
    }
    static byte getHealth(){
        return health;
    }

}
