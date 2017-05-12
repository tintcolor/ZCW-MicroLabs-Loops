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
        String addToTable = "";
        int count = 0;
        int lengthSize = getLengthOfString(4);

        for (int i = 0, m = 1; i < 4; i++, m++) {
            for (int j = 0, k = 1; j < 4; j++, k++) {

                if (i == count) {
                    addToTable += spacer(k, m,lengthSize) + k * m + " |";
                }
            }
            if (i != 4 - 1) {
                addToTable += "\n|";
            }
            count++;
        }
        System.out.println(header + "|" + addToTable);
        return header + "|" + addToTable;
    }

    public String tableSquares(int n) {
        String header = "tableSquares()\n*** Output ***\n";
        String addToTable = "";
        int count = 0;
        int lengthSize = getLengthOfString(n);

        for (int i = 0, m = 1; i < n; i++, m++) {
            for (int j = 0, k = 1; j < n; j++, k++) {

                if (i == count) {
                    addToTable += spacer(k, m,lengthSize) + k * m + " |";
                }
            }
            if (i != n - 1) {
                addToTable += "\n|";
            }
            count++;
        }
        System.out.println(header + "|" + addToTable);
        return header + "|" + addToTable;
    }

    String spacer(double k, double m, int lengthSize) {

        String addSpaces = " ";
        int f = (int) ((int) k * m);
        String lengthOfNum = Integer.toString(f);
        int g = lengthOfNum.length();

        for (int i = lengthSize; i > g; i--) {
            addSpaces += " ";
        }
        return addSpaces;
    }

    int getLengthOfString(int n) {

        int a = 0;
        for (int i = 0, m = 1; i < n; i++, m++) {
            for (int j = 0, k = 1; j < n; j++, k++) {
                a = k * m;
            }
        }

        String lengthOfNum = Integer.toString(a);
        int lengthOfSum = lengthOfNum.length();
        return lengthOfSum;
    }
}
