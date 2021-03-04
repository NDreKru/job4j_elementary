package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when5634To445Then53() {
        int x1 = 56;
        int y1 = 34;
        int x2 = 4;
        int y2 = 45;
        double expected = 53.15;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void when40To70Then3() {
        int x1 = 4;
        int y1 = 0;
        int x2 = 7;
        int y2 = 0;
        double expected = 3.0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void when03To09Then6() {
        int x1 = 0;
        int y1 = 3;
        int x2 = 0;
        int y2 = 9;
        double expected = 6.0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.1);
    }
}