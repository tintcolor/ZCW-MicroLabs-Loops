package io.zipcoder.microlabs.mastering_loops;


public class Shapes {

    public String triangle() {

        String header = "triangle()\n*** Output ***";
        String star = "*";
        String newTriangle = "";
        String completedTriangle = "";
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < i; j++) {
                newTriangle += star;
                if (j == 3) {
                    break;
                }
                completedTriangle += "\n" + newTriangle;
            }
        }
        return header + completedTriangle;
    }

    public String tableSquare() {
        String header = "tableSquare()\n*** Output ***\n";
        String lineOne = "";
        String lineTwo = "";
        String lineThree = "";
        String lineFour = "";
        int[][] stringHolder = new int[4][4];

        for (int i = 0; i < stringHolder.length; i++) {

            for (int j = 0, k = 1; j < 4; j++, k++) {
                if (stringHolder[i] == stringHolder[0]) {
                    lineOne += " " + k + " |";
                }
                if (stringHolder[i] == stringHolder[1]) {
                    lineTwo += " " + k * 2 + " |";
                }
                if (stringHolder[i] == stringHolder[2]) {
                    lineThree += " " + k * 3 + " |";
                }
                if (stringHolder[i] == stringHolder[3]) {
                    lineFour += " " + k * 4 + " |";
                }
            }
        }
        return header + "|" + lineOne + "\n" + "|" + lineTwo + "\n" + "|" + lineThree + "\n" + "|" + lineFour;
    }

    public String tableSquares(int n) {
        String header = "tableSquares()\n*** Output ***\n";
        String lineOne = "";
        String lineTwo = "";
        String lineThree = "";
        String lineFour = "";
        String lineFive = "";
        String lineSix = "";
        int[][] stringHolder = new int[n][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0, k = 1; j < n; j++, k++) {
                if (stringHolder[i] == stringHolder[0]) {
                    lineOne += " " + k + " |";
                }
                if (stringHolder[i] == stringHolder[1]) {
                    lineTwo += " " + k * 2 + " |";
                }
                if (stringHolder[i] == stringHolder[2]) {
                    lineThree += " " + k * 3 + " |";
                }
                if (stringHolder[i] == stringHolder[3]) {
                    lineFour += " " + k * 4 + " |";
                }
                if (stringHolder[i] == stringHolder[4]) {
                    lineFive += " " + k * 5 + " |";
                }
                if (stringHolder[i] == stringHolder[5]) {
                    lineSix += " " + k * 6 + " |";
                }
            }
        }
        return header + "|" + lineOne + "\n" + "|" + lineTwo + "\n" + "|" + lineThree + "\n" + "|" + lineFour +
                "\n" + "|" + lineFive + "\n" + "|" + lineSix;
    }
}
