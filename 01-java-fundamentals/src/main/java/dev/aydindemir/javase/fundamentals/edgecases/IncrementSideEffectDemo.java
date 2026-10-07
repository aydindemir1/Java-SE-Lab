package dev.aydindemir.javase.fundamentals.edgecases;

public final class IncrementSideEffectDemo {

    private IncrementSideEffectDemo() {
    }

    public static void main(String[] args) {
        int value = 5;

        int confusing = value++ + ++value;

        System.out.println("confusing result = " + confusing);
        System.out.println("final value = " + value);

        int clearValue = 5;
        int first = clearValue;
        clearValue++;
        clearValue++;
        int second = clearValue;
        int clear = first + second;

        System.out.println("clear result = " + clear);
        System.out.println("clear final value = " + clearValue);
    }
}
