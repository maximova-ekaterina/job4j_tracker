package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Mark", "Tven", "534845", "Bristol")
        );
        ArrayList<Person> persons = phones.find("Mark");
        assertThat(persons.get(0).getSurname(), is("Tven"));
    }

    @Test
    public void whenEmptyList() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Mark", "Tven", "534845", "Bristol")
        );
        ArrayList<Person> persons = phones.find("Vern");
        assertTrue(persons.isEmpty());
    }
}