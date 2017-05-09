package io.zipcoder.microlabs.mastering_loops;


public class Shapes {

    public String triangle() {

        String header = "triangle()\n*** Output ***";
        String star = "*";
        String newTriangle = "";
        String completedTriangle="";
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < i; j++) {
                newTriangle += star;
                if (j == 3) {
                    break;
                }
                completedTriangle +="\n" +newTriangle;
            }
        }
        return header + completedTriangle;
    }

    public String tableSquare() {

        return "";
    }

    public String tableSquares(int n) {
        return "";
    }
}
