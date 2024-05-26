package HomeworkFromGitHub;

import java.util.Scanner;

public class RestaurantApp {
    public static void main(String[] args) {

        // DATA LAYER
        final String CURRENCY = "MDL";

        final String FOOD_1_NAME = "Pizza";
        int food_1_available_quantity = 5;
        final float FOOD_1_PRICE = 75.5f;

        final String FOOD_2_NAME = "Mamaliga";
        int food_2_available_quantity = 5;
        final float FOOD_2_PRICE = 150f;

        final String FOOD_3_NAME = "Salad";
        final float FOOD_3_PRICE = 30f;
        int food_3_available_quantity = 5;


        // PRESENTATION & LOGIC LAYER
        System.out.printf("\n********* MENU **********\n" +
                        "1.\"%s\"%12.2f %s\n" +
                        "2.\"%s\"%12.2f %s\n" +
                        "3.\"%s\"%12.2f %s\n" +
                        "*************************\n\n",
                FOOD_1_NAME, FOOD_1_PRICE, CURRENCY,
                FOOD_2_NAME, FOOD_2_PRICE, CURRENCY,
                FOOD_3_NAME, FOOD_3_PRICE, CURRENCY);
        System.out.println("CHOOSE AN OPTION >>> ");
        Scanner in = new Scanner(System.in);
        int option = in.nextInt();

        if (option == 1) {
            System.out.println("Your choise is: " + '"' + FOOD_1_NAME + '"');
        }
        if (option == 2) {
            System.out.println("Your choise is: " + '"' + FOOD_2_NAME + '"');
        }
        if (option == 3) {
            System.out.println("Your choise is: " + '"' + FOOD_3_NAME + '"');
        }
        System.out.println("\nHow many do you want ? ");

        int foodQuantity = in.nextInt();
        System.out.println(option);
        if (option == 1 && foodQuantity <= food_1_available_quantity) {
            System.out.println("You selected " + foodQuantity + " " + FOOD_1_NAME);
            System.out.println(foodQuantity + " x " + '"' + FOOD_1_NAME + '"' + " = " + foodQuantity * FOOD_1_PRICE + " " + CURRENCY);
        } else if  (option == 2 && foodQuantity <= food_2_available_quantity) {
            System.out.println("You selected " + foodQuantity + " " + FOOD_2_NAME);
            System.out.println(foodQuantity + " x " + '"' + FOOD_2_NAME + '"' + " = " + foodQuantity * FOOD_2_PRICE + " " + CURRENCY);
        } else if  (option == 3 && foodQuantity <= food_3_available_quantity) {
         System.out.println("You selected " + foodQuantity + " " + FOOD_3_NAME);
           System.out.println(foodQuantity + " x " + '"' + FOOD_3_NAME + '"' + " = " + foodQuantity * FOOD_3_PRICE + " " + CURRENCY);
        }
            else {
            if (option == 1) {
                System.out.println("You've ordered too many " + FOOD_1_NAME + " , we only have " + food_1_available_quantity +
                        "PLEASE TRY AGAIN!\n");
            } else if ( option == 2) {
                System.out.println("You've ordered too many " + FOOD_2_NAME + " , we only have 5\n" +
                   "PLEASE TRY AGAIN!\n");

            } else if ( option == 3 ) {
                System.out.println("You've ordered too many " + FOOD_3_NAME + " , we only have 5\n" +
                  "PLEASE TRY AGAIN!\n");
            }
        }
         if (foodQuantity <= 5) {
            System.out.println("Confirm order? ( 1 - yes, 0 - no)"); //Confirm order ( 1 - yes, 0 - no )?
           int confirmFoodOrder = in.nextInt();
            if (confirmFoodOrder == 1) {
               System.out.println("Thank you!");
            } else
                System.out.println("Buy");
        }
    }
}