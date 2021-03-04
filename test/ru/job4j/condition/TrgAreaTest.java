package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrgAreaTest {

    @Test
    public void when333Than3i9() {
        double a = 3.0;
        double b = 3.0;
        double c = 3.0;
        double expected = 3.9;
        double out = TrgArea.area(a, b, c);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when444Than6i93() {
        double a = 4.0;
        double b = 4.0;
        double c = 4.0;
        double expected = 6.93;
        double out = TrgArea.area(a, b, c);
        Assert.assertEquals(expected, out, 0.01);
    }
}