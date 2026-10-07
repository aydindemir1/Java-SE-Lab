package dev.aydindemir.javase.fundamentals.types;

public final class ConversionAndOverflowDemo {

    private ConversionAndOverflowDemo() {
    }

    public static void main(String[] args) {
        int count = 42;
        long widened = count;

        long largeValue = 3_000_000_000L;
        int narrowed = (int) largeValue;

        int overflowed = Integer.MAX_VALUE + 1;

        System.out.println("Widened: " + widened);
        System.out.println("Narrowed with data loss: " + narrowed);
        System.out.println("Overflowed: " + overflowed);

        try {
            int exact = Math.addExact(Integer.MAX_VALUE, 1);
            System.out.println(exact);
        } catch (ArithmeticException exception) {
            System.out.println("Math.addExact detected overflow: " + exception.getMessage());
        }
    }
}
