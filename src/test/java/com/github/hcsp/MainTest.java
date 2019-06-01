package com.github.hcsp;

import static org.hamcrest.Matchers.containsStringIgnoringCase;

import com.github.blindpirate.extensions.CaptureSystemOutput;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    @CaptureSystemOutput
    public void importStringUtilsCorrectly(CaptureSystemOutput.OutputCapture capture) {
        capture.expect(containsStringIgnoringCase("Empty string is empty: true"));
        Main.main(null);
    }
}
