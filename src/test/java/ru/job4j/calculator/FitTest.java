package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class FitTest {

    @Test
    public void testmainoutputscorrectweightformanwithheight187() {
        short height = 187;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Fit.main(null);
        String expectedOutput = "Man 187 is 85.05\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman170Then69() {
        short in = 170;
        double expected = 69;
        double out = Fit.womanWeight(in);
        assertEquals(expected, out, 0.01);
    }
}