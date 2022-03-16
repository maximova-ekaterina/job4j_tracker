package ru.job4j.collection;

import org.junit.Test;
import java.util.Comparator;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class JobTest {

    @Test
    public void whenDescByNameAndPriority() {
        Comparator<Job> cmpNamePriority
                = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Mark Tven", 0),
                new Job("Jul Vern", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenAscByNameAndPriority() {
        Comparator<Job> cmpNamePriority
                = new JobAscByPriority().thenComparing(new JobAscByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Jul Vern", 4),
                new Job("Mark Tven", 3)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenAscByPriority() {
        Comparator<Job> cmpNamePriority = new JobAscByPriority();
        int rsl = cmpNamePriority.compare(
                new Job("Jul Vern", 4),
                new Job("Mark Tven", 3)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenDescByPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByPriority();
        int rsl = cmpNamePriority.compare(
                new Job("Jul Vern", 4),
                new Job("Mark Tven", 3)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenAscByNameEqual() {
        Comparator<Job> cmpNamePriority = new JobAscByName();
        int rsl = cmpNamePriority.compare(
                new Job("Jul Vern", 1),
                new Job("Jul Vern", 2)
        );
        assertThat(rsl, equalTo(0));
    }

    @Test
    public void whenDescByName() {
        Comparator<Job> cmpNamePriority = new JobDescByName();
        int rsl = cmpNamePriority.compare(
                new Job("Alfa Beta", 1),
                new Job("Alfa", 1)
        );
        assertThat(rsl, lessThan(0));
    }
}