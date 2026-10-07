package dev.aydindemir.javase.fundamentals.bytecode;

public final class StringConcatenationBytecodeDemo {

    private StringConcatenationBytecodeDemo() {
    }

    public static String buildMessage(String name, int count) {
        return "Hello " + name + ", count=" + count;
    }

    public static void main(String[] args) {
        System.out.println(buildMessage("Java", 25));
    }
}
