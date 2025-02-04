package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"one", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Menu: ");
        assertThat(selected, is(1));
    }

    @Test
    public void whenNegativeInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"-1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Menu: ");
        assertThat(selected, is(-1));
    }

    @Test
    public void whenValidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"2"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Menu: ");
        assertThat(selected, is(2));
    }

    @Test
    public void whenMultipleInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"2", "1", "10"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Menu: ");
        assertThat(selected, is(2));
        selected = input.askInt("Menu: ");
        assertThat(selected, is(1));
        selected = input.askInt("Menu: ");
        assertThat(selected, is(10));
    }
}