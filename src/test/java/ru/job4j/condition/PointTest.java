package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10to52then4dot47() {
        double expected = 4.47;
        Point a = new Point(1, 0);
        Point b = new Point(5, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when2m1tom12then4dot24() {
        double expected = 4.24;
        Point a = new Point(2, -1);
        Point b = new Point(-1, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when49to17then3dot60() {
        double expected = 3.60;
        Point a = new Point(4, 9);
        Point b = new Point(1, 7);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}