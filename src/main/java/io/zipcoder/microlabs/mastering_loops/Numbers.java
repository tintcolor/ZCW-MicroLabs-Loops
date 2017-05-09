package io.zipcoder.microlabs.mastering_loops;


public class Numbers {

    public String oneToTen() {
        String output = "*** Output ***\n";
        String onToTenTitle = "oneToTen()\n";
        String filledString = "";
        for (int i = 1; i < 11; i++) {
            if (i == 10) {
                filledString += Integer.toString(i);
            } else {
                filledString += Integer.toString(i) + "\n";
            }
        }
        return output + onToTenTitle + filledString;
    }

    public String oddNumbers() {

        String output = "*** Output ***\n";
        String oodNumbersTitle = "oodNumbers()\n";
        String filledString = "";
        for (int i = 1; i < 20; i++) {
            if (i % 2 != 0) {
                if (i == 19) {
                    filledString += Integer.toString(i);
                } else {
                    filledString += Integer.toString(i) + "\n";
                }
            }
        }
        return output + oodNumbersTitle + filledString;
    }

    public String squares() {
        String output = "*** Output ***\n";
        String squareNumbersTitle = "squares()\n";
        String filledString = "";
        for (int i = 1; i < 11; i++) {

            if (i == 10) {
                filledString += Integer.toString((int) Math.pow(i, 2));
            } else {
                filledString += Integer.toString((int) Math.pow(i, 2)) + "\n";
            }

        }
        return output + squareNumbersTitle + filledString;
    }
//must have mathrandom
    public String random4() {
        String output = "*** Output ***\n";
        String squareNumbersTitle = "random4()\n";
        String filledString = "";
        double randomNumber =  Math.random()*10;



        for (int i = 1; i < 11; i++) {

            filledString +=  Integer.toString((int)randomNumber) + "\n";

        }
        return output + squareNumbersTitle + filledString;

    }

    public String even(int n) {
        return "";
    }

    public String powers(int n) {
        return "";
    }

}
