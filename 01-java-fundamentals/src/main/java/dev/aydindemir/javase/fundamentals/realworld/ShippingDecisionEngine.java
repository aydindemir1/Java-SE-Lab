package dev.aydindemir.javase.fundamentals.realworld;

public final class ShippingDecisionEngine {

    private static final double FREE_STANDARD_SHIPPING_LIMIT = 1_500.0;
    private static final double STANDARD_SHIPPING_FEE = 79.90;
    private static final double EXPRESS_SHIPPING_FEE = 149.90;

    private ShippingDecisionEngine() {
    }

    public static void main(String[] args) {
        double basketAmount = 1_725.50;
        boolean expressRequested = false;

        double shippingFee = calculateShippingFee(basketAmount, expressRequested);
        String message = shippingFee == 0.0
                ? "Free shipping"
                : "Shipping fee: " + shippingFee;

        System.out.println(message);
    }

    static double calculateShippingFee(double basketAmount, boolean expressRequested) {
        if (basketAmount < 0) {
            throw new IllegalArgumentException("Basket amount cannot be negative");
        }

        if (expressRequested) {
            return EXPRESS_SHIPPING_FEE;
        }

        return basketAmount >= FREE_STANDARD_SHIPPING_LIMIT
                ? 0.0
                : STANDARD_SHIPPING_FEE;
    }
}
