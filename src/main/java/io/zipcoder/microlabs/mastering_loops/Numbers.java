package io.zipcoder.microlabs.mastering_loops;


import java.util.Random;

public class Numbers {

    public String oneToTen() {
        String output = "*** Output ***\n";
        String onToTenTitle = "oneToTen()";
        String filledString = "";
        for (int i = 1; i < 11; i++) {
                filledString += "\n" +i;
        }
        return output + onToTenTitle + filledString;
    }

    public String oddNumbers() {

        String output = "*** Output ***\n";
        String oodNumbersTitle = "oodNumbers()";
        String filledString = "";
        for (int i = 1; i < 20; i+=2) {
                    filledString += "\n"+i ;
        }
        return output + oodNumbersTitle + filledString;
    }

    public String squares() {
        String output = "*** Output ***\n";
        String squareNumbersTitle = "squares()";
        String filledString = "";
        for (int i = 1; i < 11; i++) {
                filledString +=  "\n"+Integer.toString((int) Math.pow(i, 2));
        }
        return output + squareNumbersTitle + filledString;
    }

    //must have mathrandom
    public String random4() {
        String output = "*** Output ***\n";
        String squareNumbersTitle = "random4()\n";
        String filledString = "";
        Random random = new Random();
        double randomNumber = Math.random() * 10;
        for (int i = 1; i < 11; i++) {
            filledString += Integer.toString((int) randomNumber) + "\n";
        }
        return (random.nextInt(9) + 1) + "\n" + (random.nextInt(9) + 1)
                + "\n" + (random.nextInt(9) + 1) + "\n" + (random.nextInt(9) + 1);
    }

    public String even(int n) {
        String output = "*** Output ***\n";
        String evenNumbersTitle = "even(" + n + ")";
        String filledString = "";
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                filledString += "\n" + Integer.toString((i));
            }
        }
        return output + evenNumbersTitle + filledString;
    }

    public String powers(int n) {
        String output = "*** Output ***\n";
        String evenNumbersTest = "even(" + n + ")";
        String filledString = "";
        for (int i = 1; i <= n; i++) {
            filledString += "\n" + Integer.toString(((int) Math.pow(2, i)));
        }
        return output + evenNumbersTest + filledString;

    }

}
