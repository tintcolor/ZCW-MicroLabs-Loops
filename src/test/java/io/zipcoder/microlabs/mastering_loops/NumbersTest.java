package io.zipcoder.microlabs.mastering_loops;

import org.junit.Assert;
import org.junit.Test;

public class NumbersTest {

    @Test
    public void oneToTenTest(){
        //: Given
        Numbers numbers = new Numbers();
        String expected = "*** Output ***\noneToTen()\n1\n2\n3\n4\n5\n6\n7\n8\n9\n10";

        //: When
        String actual = numbers.oneToTen();

        //: Then
        Assert.assertEquals("The two strings are equal", expected, actual);
    }

    @Test
    public void oddNumbersTest(){
        //: Given

        //: When

        //: Then
    }

    @Test
    public void squaresTest(){
        //: Given

        //: When

        //: Then
    }

    @Test
    public void random4Test(){
        //: Given

        //: When

        //: Then
    }

    @Test
    public void evenTest(){
        //: Given

        //: When

        //: Then
    }

    @Test
    public void powersTest(){
        //: Given

        //: When

        //: Then
    }

}
