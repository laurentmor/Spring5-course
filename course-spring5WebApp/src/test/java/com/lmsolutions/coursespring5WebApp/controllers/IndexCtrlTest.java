package com.lmsolutions.coursespring5WebApp.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.ui.Model;

import static junit.framework.TestCase.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IndexCtrlTest {

    private IndexCtrl indexCtrlUnderTest;

    @BeforeEach
    public void setUp() {
        indexCtrlUnderTest = new IndexCtrl();
    }

    @Test
    public void testIndex() {
        // Setup
        final Model model = null;
        final String expectedResult = "result";

        // Run the test
        final String result = indexCtrlUnderTest.index(model);

        // Verify the results
        assertEquals(expectedResult, result);
    }
}
