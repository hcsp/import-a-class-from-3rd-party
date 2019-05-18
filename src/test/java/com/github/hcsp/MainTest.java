package com.github.hcsp;

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
