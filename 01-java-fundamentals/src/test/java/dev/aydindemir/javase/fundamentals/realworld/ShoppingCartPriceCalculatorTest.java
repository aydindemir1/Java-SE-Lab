package dev.aydindemir.javase.fundamentals.realworld;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class ShoppingCartPriceCalculatorTest {

    @Test
    void shouldCalculateDiscount() {
        assertEquals(100.0, ShoppingCartPriceCalculator.calculateDiscount(1_000.0, 0.10), 0.0001);
    }

    @Test
    void shouldRejectInvalidDiscountRate() {
        assertThrows(
                IllegalArgumentException.class,
                () -> ShoppingCartPriceCalculator.calculateDiscount(1_000.0, 1.10)
        );
    }

    @Test
    void shouldRejectNegativeSubtotal() {
        assertThrows(
                IllegalArgumentException.class,
                () -> ShoppingCartPriceCalculator.calculateDiscount(-1.0, 0.10)
        );
    }

    @Test
    void shouldReturnFreeShippingAtThreshold() {
        assertEquals(0.0, ShoppingCartPriceCalculator.calculateShipping(1_500.0));
    }

    @Test
    void shouldChargeShippingBelowThreshold() {
        assertEquals(79.90, ShoppingCartPriceCalculator.calculateShipping(1_499.99), 0.0001);
    }
}
