package io.zipcoder.microlabs.mastering_loops;


import org.junit.Test;
import org.junit.Assert;

public class ShapesTest {


    @Test
    public void triangleTest(){
        //: Given
        Shapes shapes = new Shapes();
        String expected = "triangle()\n*** Output ***\n*\n**\n***\n****\n*****";

        //: When
        String actual = shapes.triangle();

        //: Then
        Assert.assertEquals("The two triangles are equal", expected, actual);
    }

    @Test
    public void tableSquareTest(){
        //: Given

        //: When

        //: Then
    }

    @Test
    public void tableSquaresTest(){
        //: Given

        //: When

        //: Then
    }
}
