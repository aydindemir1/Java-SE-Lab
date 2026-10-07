package dev.aydindemir.javase.fundamentals.realworld;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class ShippingDecisionEngineTest {

    @Test
    void shouldReturnFreeStandardShippingAtThreshold() {
        assertEquals(0.0, ShippingDecisionEngine.calculateShippingFee(1_500.0, false));
    }

    @Test
    void shouldChargeStandardShippingBelowThreshold() {
        assertEquals(79.90, ShippingDecisionEngine.calculateShippingFee(1_499.99, false), 0.0001);
    }

    @Test
    void shouldChargeExpressShippingEvenAboveThreshold() {
        assertEquals(149.90, ShippingDecisionEngine.calculateShippingFee(2_000.0, true), 0.0001);
    }

    @Test
    void shouldRejectNegativeBasketAmount() {
        assertThrows(
                IllegalArgumentException.class,
                () -> ShippingDecisionEngine.calculateShippingFee(-1.0, false)
        );
    }
}
