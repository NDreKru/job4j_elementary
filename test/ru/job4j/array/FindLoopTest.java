package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] input = {5, 4, 3, 2};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHasnt7ThenMin1() {
        int[] input = {5, 4, 3, 2};
        int value = 7;
        int result = FindLoop.indexOf(input, value);
        int expect = -1;
        Assert.assertThat(result, is(expect));
    }

    @Test
    public void whenFind5() {
        int[] input = {2, 6, 7, 3, 8, 3, 5};
        int start = 4;
        int finish = 6;
        int value = 3;
        int rst = FindLoop.indexOf(input, value, start, finish);
        int expect = 5;
        Assert.assertThat(rst, is(expect));
    }

    @Test
    public void whenNotFound() {
        int[] input = {2, 6, 7, 3, 8, 3, 5};
        int start = 0;
        int finish = 2;
        int value = 3;
        int rst = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        Assert.assertThat(rst, is(expect));
    }
}