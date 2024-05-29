package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {
        assertEquals(1, 1);
    }
    @Test
    public void mulTest()
    {
        App a=new App();
        
        int output=a.multi(5,4);
        assertEquals(20,output);

    }
}
