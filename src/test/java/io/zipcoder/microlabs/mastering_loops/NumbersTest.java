package io.zipcoder.microlabs.mastering_loops;

import org.junit.Assert;
import org.junit.Test;

public class NumbersTest {

    @Test
    public void oneToTenTest() {
        //: Given
        Numbers numbers = new Numbers();
        String expected = "*** Output ***\noneToTen()\n1\n2\n3\n4\n5\n6\n7\n8\n9\n10";

        //: When
        String actual = numbers.oneToTen();

        //: Then
        Assert.assertEquals("The two strings are equal", expected, actual);
    }

    @Test
    public void oddNumbersTest() {
        //: Given
        Numbers numbers = new Numbers();
        String expected = "*** Output ***\noodNumbers()\n1\n3\n5\n7\n9\n11\n13\n15\n17\n19";
        //: When
        String actual = numbers.oddNumbers();

        //: Then
        Assert.assertEquals("The two strings of odd numbers are equal", expected, actual);
    }

    @Test
    public void squaresTest() {
        //: Given
        Numbers numbers = new Numbers();
        String expected = "*** Output ***\nsquares()\n1\n4\n9\n16\n25\n36\n49\n64\n81\n100";

        //: When
        String actual = numbers.squares();

        //: Then
        Assert.assertEquals("The two strings of squares are equal", expected, actual);
    }

    @Test
    public void random4Test() {
        //: Given
        Numbers numbers = new Numbers();
        double randomNumber =  Math.random()*10;
        String expected = "*** Output ***\nrandom4()\n3\n5\n2\n8";
//        String expected = "*** Output ***\nrandom4()\n"+Integer.toString((int)randomNumber)+"\n"+
//                Integer.toString((int)randomNumber)+"\n"+Integer.toString((int)randomNumber)+"\n"+Integer.toString((int)randomNumber);

        //: When
        String actual = numbers.random4();

        //: Then
        Assert.assertEquals("The two strings of random numbers are equal", expected, actual);
    }

    @Test
    public void evenTest() {
        //: Given

        //: When

        //: Then
    }

    @Test
    public void powersTest() {
        //: Given

        //: When

        //: Then
    }

}
