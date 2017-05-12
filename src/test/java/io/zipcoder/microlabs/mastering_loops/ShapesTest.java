package io.zipcoder.microlabs.mastering_loops;


import org.junit.Test;
import org.junit.Assert;

public class ShapesTest {


    @Test
    public void triangleTest() {
        //: Given
        Shapes shapes = new Shapes();
        String expected = "triangle()\n*** Output ***\n*\n**\n***\n****\n*****";

        //: When
        String actual = shapes.triangle();

        //: Then
        Assert.assertEquals("The two triangles are equal", expected, actual);
    }

    @Test
    public void tableSquareTest() {
        //: Given
        Shapes shapes = new Shapes();
        String expected = "tableSquare()\n*** Output ***\n|  1 |  2 |  3 |  4 |\n|  2 |  4 |  6 |  8 |\n|  3 |  6 |  9 | 12 |\n|  4 |  8 | 12 | 16 |";

        //: When
        String actual = shapes.tableSquare();

        //: Then
        Assert.assertEquals("The two table squares are equal", expected, actual);
    }

    @Test
    public void tableSquaresTest() {
        //: Given
        Shapes shapes = new Shapes();
        int n = 10;
        String expected = "tableSquares()\n*** Output ***\n|  1 |  2 |  3 |  4 |  5 |  6 |\n|" +
                "  2 |  4 |  6 |  8 | 10 | 12 |\n|  3 |  6 |  9 | 12 | 15 | 18 |\n|  4 |  8 | 12 | 16 | 20 | 24 |\n|  5 | 10 | 15 | 20 | 25 | 30 |\n" +
                "|  6 | 12 | 18 | 24 | 30 | 36 |";

        //: When
        String actual = shapes.tableSquares(n);

        //: Then
        Assert.assertEquals("The two table squares that are extended are equal", expected, actual);
    }
}
