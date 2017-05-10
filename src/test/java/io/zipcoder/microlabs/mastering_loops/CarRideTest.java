package io.zipcoder.microlabs.mastering_loops;


import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

public class CarRideTest {

    @Test
    public void areWeThereYetTest() {
        //given
        CarRide carRide = new CarRide();
        new Scanner("Yes");
        String expected = "Good!";
        // when
        String actual = carRide.areWeThereYet();
        // then
        Assert.assertEquals(expected, actual);

    }


}