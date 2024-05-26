package array.examples;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTranning {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //TODO Try give 7 values from the keyboard;
        System.out.println("Enter the size of array: ");
        int size = input.nextInt();
         //Initialize the size of array
        int[] weeklyTemp = new int[size];

        for(int i = 0; i < weeklyTemp.length; i++){
            System.out.println("Your value for index" + i);
            weeklyTemp[i] = input.nextInt();
        }
        System.out.println("The values in the array are: ");
        System.out.println(Arrays.toString(weeklyTemp));
    }
}
