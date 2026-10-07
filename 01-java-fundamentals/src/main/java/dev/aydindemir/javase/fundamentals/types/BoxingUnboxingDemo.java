package dev.aydindemir.javase.fundamentals.types;

public final class BoxingUnboxingDemo {

    private BoxingUnboxingDemo() {
    }

    public static void main(String[] args) {
        int primitive = 42;
        Integer boxed = primitive;
        int unboxed = boxed;

        System.out.println("primitive = " + primitive);
        System.out.println("boxed = " + boxed);
        System.out.println("unboxed = " + unboxed);

        Integer nullable = null;
        try {
            int value = nullable;
            System.out.println(value);
        } catch (NullPointerException exception) {
            System.out.println("Unboxing null causes NullPointerException");
        }
    }
}
