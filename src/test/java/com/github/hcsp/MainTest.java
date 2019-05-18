package com.github.hcsp;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void importStringUtilsCorrectly() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos, true));
        assertTrue(new String(baos.toByteArray()).contains("Empty string is empty: true"));
    }
}
