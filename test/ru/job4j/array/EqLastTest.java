package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.Matchers.is;

public class EqLastTest {

    @Test
    public void whenLastEq() {
        int[] left = new int[] {1, 2, 3};
        int[] right = new int[] {2, 9, 3};
        boolean expect = true;
        boolean rsl = EqLast.check(left, right);
        Assert.assertEquals(expect, rsl);
    }

    @Test
    public void whenLastNotEq() {
        int[] left = new int[] {1, 2, 4};
        int[] right = new int[] {2, 9, 3};
        boolean expect = false;
        boolean rsl = EqLast.check(left, right);
        Assert.assertEquals(expect, rsl);
    }
}