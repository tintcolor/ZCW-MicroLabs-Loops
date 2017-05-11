package io.zipcoder.microlabs.mastering_loops;


import org.junit.Assert;
import org.junit.Test;
import java.io.ByteArrayInputStream;

public class CarRideTest {

    @Test
    public void areWeThereYetTest() {
        //given
        String input = "No\nSpoons\nYes\n";
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(input.getBytes());
        CarRide carRide = new CarRide(byteArrayInputStream);

        String expected = "Good";
        // when
        String actual = carRide.areWeThereYet();
        // then
        Assert.assertEquals(expected, actual);

    }


}