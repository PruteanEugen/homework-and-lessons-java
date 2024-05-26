package HomeworkFromGitHub;

import java.util.Scanner;

public class Ship {
    public static void main(String[] args) {
        System.out.println(" Input the coordonate of the ship: ");
        Scanner ship = new Scanner(System.in);
        int big_ship = ship.nextInt();

        for(int x=0; x<10; x++) {
            if (x == big_ship) {
                System.out.print( "W" );
            } else if (x == (big_ship - 1) || x == (big_ship+1)) {
                System.out.print( "w" );
            } else {
                System.out.print( "~" );
            }
        }
    }
}

//SE CERE:
//
//Sa se schimbe codul astfel incat coordonata vaporului sa poata fi data de la tastatura
//
//Variabila small_ship sa fie inlocuita cu big_ship - vaporul mare, adica - coordonata vaporului mare
//
//Sa se schimbe codul if/else astfel incat daca big_ship = 5 - rezultatul sa arate asa