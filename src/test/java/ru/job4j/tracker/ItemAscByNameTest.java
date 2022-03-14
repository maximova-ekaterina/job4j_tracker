package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ItemAscByNameTest {

    @Test
    public void testCompareAscend() {
        List<Item> items = Arrays.asList(
                new Item("10"),
                new Item("54"),
                new Item("32")
        );
        Collections.sort(items, new ItemAscByName());
        List<Item> expected = Arrays.asList(
                new Item("10"),
                new Item("32"),
                new Item("54")
        );
        assertThat(items, is(expected));
    }

    @Test
    public void testCompareDescend() {
        List<Item> items = Arrays.asList(
                new Item("10"),
                new Item("54"),
                new Item("32")
        );
        Collections.sort(items, new ItemDescByName());
        List<Item> expected = Arrays.asList(
                new Item("54"),
                new Item("32"),
                new Item("10")
        );
        assertThat(items, is(expected));
    }
}