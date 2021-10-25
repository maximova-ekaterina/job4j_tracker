package ru.job4j.oop;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        assertThat(dist, closeTo(2.0, 0.01));
    }

    @Test
    public void distance3d() {
        Point one = new Point(4, 4, 4);
        Point two = new Point(2, 2, 3);
        double dist = one.distance3d(two);
        assertThat(dist, closeTo(3.0, 0.01));
    }
}