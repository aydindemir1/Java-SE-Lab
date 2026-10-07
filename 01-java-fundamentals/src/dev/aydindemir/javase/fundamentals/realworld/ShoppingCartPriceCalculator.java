package dev.aydindemir.javase.fundamentals.realworld;

/**
 * Java Fundamentals sınırları içinde gerçek hayata yakın küçük bir örnek.
 *
 * Framework, database veya dış servis yoktur. Amaç:
 * variables, arithmetic, conditionals, methods ve formatting kullanımını
 * tek bir problem üzerinde göstermek.
 */
public final class ShoppingCartPriceCalculator {

    private static final double FREE_SHIPPING_THRESHOLD = 1_500.0;
    private static final double SHIPPING_FEE = 79.90;

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

    private static double calculateDiscount(double subtotal, double rate) {
        if (rate < 0.0 || rate > 1.0) {
            throw new IllegalArgumentException("Discount rate must be between 0 and 1");
        }
        return subtotal * rate;
    }

    private static double calculateShipping(double discountedTotal) {
        return discountedTotal >= FREE_SHIPPING_THRESHOLD ? 0.0 : SHIPPING_FEE;
    }
}
