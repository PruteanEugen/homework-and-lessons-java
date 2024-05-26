package array.examples;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        //TODO Try give 7 values from the keyboard;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();

        //Initialize the array with the specified size
        int[] weeklyTemp = new int [size];

        //Loop through the array to get input for each element
        for(int i =0; i < weeklyTemp.length; i++){
            System.out.println("Enter value for intex " +i+":");
            weeklyTemp[i] = input.nextInt();
        }
        //Desplay the array contents using the enhanced for the loop
        System.out.println("The values in the array are: ");
        System.out.println(Arrays.toString(weeklyTemp));
    }
}
//TODO HW1 Show only the termperatores for the monday -> friday
