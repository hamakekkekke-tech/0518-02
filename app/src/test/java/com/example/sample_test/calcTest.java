package com.example.sample_test;

import static org.junit.Assert.*;

import org.junit.Test;

public class calcTest {
    private calc mcalc;
    @Test
    public void plus() {
        mcalc = new calc();
        assertEquals(3, mcalc.plus(2,1), 0);
    }
    @Test
    public void div() {
        mcalc = new calc();
        assertEquals(2, mcalc.div(2,1), 0);
    }
}