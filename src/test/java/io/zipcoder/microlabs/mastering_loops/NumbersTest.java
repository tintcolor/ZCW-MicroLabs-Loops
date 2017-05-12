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
        Assert.assertEquals("These numbers should count from 1-10", expected, actual);
    }

    @Test
    public void oddNumbersTest() {
        //: Given
        Numbers numbers = new Numbers();
        String expected = "*** Output ***\noodNumbers()\n1\n3\n5\n7\n9\n11\n13\n15\n17\n19";
        //: When
        String actual = numbers.oddNumbers();

        //: Then
        Assert.assertEquals("These numbers should count odd numbers from 1-20 inclusively", expected, actual);
    }

    @Test
    public void squaresTest() {
        //: Given
        Numbers numbers = new Numbers();
        String expected = "*** Output ***\nsquares()\n1\n4\n9\n16\n25\n36\n49\n64\n81\n100";

        //: When
        String actual = numbers.squares();

        //: Then
        Assert.assertEquals("These numbers should list the squares from 1-100", expected, actual);
    }

    @Test
    public void random4Test() {
        // Given
        Numbers numbers = new Numbers();

        // When
        String actual = numbers.random4();
        int num1 = Character.getNumericValue(actual.charAt(0));
        int num2 = Character.getNumericValue(actual.charAt(2));
        int num3 = Character.getNumericValue(actual.charAt(4));
        int num4 = Character.getNumericValue(actual.charAt(6));

        // Then
        Assert.assertTrue(num1 >= 1 && num1 <= 10);
        Assert.assertTrue(num2 >= 1 && num2 <= 10);
        Assert.assertTrue(num3 >= 1 && num3 <= 10);
        Assert.assertTrue(num4 >= 1 && num4 <= 10);
    }

    @Test
    public void evenTest() {
        //: Given
        Numbers numbers = new Numbers();
        int n = 20;
        String expected = "*** Output ***\neven(" + n + ")\n2\n4\n6\n8\n10\n12\n14\n16\n18";

        //: When
        String actual = numbers.even(n);

        //: Then
        Assert.assertEquals("These numbers should test the numbers between 1-20 inclusively", expected, actual);
        //Assert.assertTrue(actual.);
    }

    @Test
    public void powersTest() {
        //: Given
        Numbers numbers = new Numbers();
        int n = 8;
        String expected = "*** Output ***\neven(" + n + ")\n2\n4\n8\n16\n32\n64\n128\n256";

        //: When
        String actual = numbers.powers(n);

        //: Then
        Assert.assertEquals("These numbers should list the number to the 2nd power of the incrementing n", expected, actual);
    }

}