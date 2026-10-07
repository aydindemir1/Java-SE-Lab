package dev.aydindemir.javase.fundamentals.bytecode;

public final class BoxingBytecodeDemo {

    private BoxingBytecodeDemo() {
    }

    public static Integer box(int value) {
        return value;
    }

    public static int unbox(Integer value) {
        return value;
    }

    public static void main(String[] args) {
        Integer boxed = box(42);
        System.out.println(unbox(boxed));
    }
}
