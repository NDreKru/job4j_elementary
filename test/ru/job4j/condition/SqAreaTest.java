package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP12K2Then8() {
        int p = 12;
        int k = 2;
        double expected = 8;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP180K6Then864() {
        int p = 180;
        int k = 6;
        double expected = 864;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}