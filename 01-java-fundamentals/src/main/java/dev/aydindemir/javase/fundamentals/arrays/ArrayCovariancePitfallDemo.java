package dev.aydindemir.javase.fundamentals.arrays;

public final class ArrayCovariancePitfallDemo {

    private ArrayCovariancePitfallDemo() {
    }

    public static void main(String[] args) {
        Number[] numbers = new Integer[2];
        numbers[0] = 42;

        try {
            numbers[1] = 3.14;
        } catch (ArrayStoreException exception) {
            System.out.println("Runtime type check prevented invalid store: " + exception);
        }
    }
}
