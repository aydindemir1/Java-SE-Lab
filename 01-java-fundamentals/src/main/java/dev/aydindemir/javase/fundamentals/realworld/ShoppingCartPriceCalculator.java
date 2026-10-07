package dev.aydindemir.javase.fundamentals.realworld;

public final class ShoppingCartPriceCalculator {

    static final double FREE_SHIPPING_THRESHOLD = 1_500.0;
    static final double SHIPPING_FEE = 79.90;

    private ShoppingCartPriceCalculator() {
    }

    public static void main(String[] args) {
        double unitPrice = 649.90;
        int quantity = 3;
        double discountRate = 0.10;

        double subtotal = unitPrice * quantity;
        double discount = calculateDiscount(subtotal, discountRate);
        double discountedTotal = subtotal - discount;
        double shipping = calculateShipping(discountedTotal);
        double total = discountedTotal + shipping;

        System.out.printf("Subtotal : %.2f%n", subtotal);
        System.out.printf("Discount : %.2f%n", discount);
        System.out.printf("Shipping : %.2f%n", shipping);
        System.out.printf("Total    : %.2f%n", total);
    }

    static double calculateDiscount(double subtotal, double rate) {
        if (subtotal < 0.0) {
            throw new IllegalArgumentException("Subtotal cannot be negative");
        }
        if (rate < 0.0 || rate > 1.0) {
            throw new IllegalArgumentException("Discount rate must be between 0 and 1");
        }
        return subtotal * rate;
    }

    static double calculateShipping(double discountedTotal) {
        if (discountedTotal < 0.0) {
            throw new IllegalArgumentException("Discounted total cannot be negative");
        }
        return discountedTotal >= FREE_SHIPPING_THRESHOLD ? 0.0 : SHIPPING_FEE;
    }
}
