package io.zipcoder.microlabs.mastering_loops;

import java.util.Scanner;

public class CarRide {

    public String areWeThereYet() {

        Scanner yes = new Scanner(System.in);
        String convertToString = yes.nextLine();
        boolean continueLoop = true;
        //  while (continueLoop) {

        //System.out.println(yes.toString());

        switch (convertToString) {

            case "No":
                System.out.println("Are we there yet?");
                break;
            case "Spoons":
                System.out.println("Are we there yet?");
                break;
            case "Yes":
            //    continueLoop = false;
                return "Good!";
//            }
        }
        return "";
    }

}
