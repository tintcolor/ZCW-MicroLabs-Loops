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
        String header = "tableSquare()\n*** Output ***";
        String lineBreaker = "|";
        int[][] stringHolder = new int[4][4];


        for (int i = 0; i < stringHolder.length; i++) {

            for (int j = 0; j < 4; j++) {

               // stringHolder[i][j] = j;
                if (stringHolder[i][j] == stringHolder[0][j]){
                    System.out.println(stringHolder[i][j]);
                }

                if (stringHolder[i][j] == stringHolder[1][j]){
                    // System.out.println(stringHolder[i][j]);
                }

                if (stringHolder[i][j] == stringHolder[2][j]){
                    // System.out.println(stringHolder[i][j]);
                }

                if (stringHolder[i][j] == stringHolder[3][j]){
                    // System.out.println(stringHolder[i][j]);
                }
//                .p,,o  vwwrrwte


//                    if (j % 1 == 0) {
//                        System.out.println(j);
//                    } else if (j % 2 == 0) {
//                        System.out.println(j * 2);
//                    } else if (j % 3 == 0) {
//                        System.out.println(j * 2);
//                    }

            }
            System.out.println();
        }


        return "";
    }

    public String tableSquares(int n) {
        return "";
    }
}
