package io.zipcoder.microlabs.mastering_loops;

import java.io.InputStream;
import java.util.Scanner;

public class CarRide {

    Scanner in;

    CarRide(InputStream scannerIn) {

        in = new Scanner(scannerIn);
    }

    public String areWeThereYet() {

        String convertToString;

        boolean continueLoop = true;
        System.out.println("Are we there yet?");
        String output = "";

        while (continueLoop) {
            convertToString = in.nextLine();
            System.out.println(convertToString);

            if (convertToString.equals("Yes")) {
                output = "Good";
                continueLoop = false;
            } else {
                System.out.println("Are we there yet?");
            }
        }
        return output;
    }

    public static void main(String[] args) {
        CarRide carRide = new CarRide(System.in);
        carRide.areWeThereYet();
    }

}
