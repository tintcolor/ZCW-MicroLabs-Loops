package io.zipcoder.microlabs.mastering_loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CarRide {

    public String areWeThereYet() {

        Scanner yes = new Scanner(System.in);
        String convertToString = "";

        boolean continueLoop = true;
        System.out.println("Are we there yet?");

        while (continueLoop) {
            convertToString = yes.nextLine();

            if (convertToString.equals("Yes")) {
                return "Good";
            } else {
                System.out.println("Are we there yet?");
            }
            continueLoop = true;
        }
        return "";
    }

    public static void main(String[] args) {
        CarRide carRide = new CarRide();
        carRide.areWeThereYet();
    }

}
