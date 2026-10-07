package dev.aydindemir.javase.fundamentals.methods;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class VarargsDemoTest {

    @Test
    void shouldSumNoValues() {
        assertEquals(0, VarargsDemo.sum());
    }

    @Test
    void shouldSumMultipleValues() {
        assertEquals(60, VarargsDemo.sum(10, 20, 30));
    }
}
