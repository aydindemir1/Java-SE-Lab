package dev.aydindemir.javase.fundamentals.edgecases;

public final class InitializationOrderDemo {

    static {
        System.out.println("1 - static initializer");
    }

    private static final String STATIC_FIELD = initializeStaticField();

    {
        System.out.println("4 - instance initializer");
    }

    private final String instanceField = initializeInstanceField();

    public InitializationOrderDemo() {
        System.out.println("6 - constructor");
    }

    private static String initializeStaticField() {
        System.out.println("2 - static field initialization");
        return "static";
    }

    private String initializeInstanceField() {
        System.out.println("5 - instance field initialization");
        return "instance";
    }

    public static void main(String[] args) {
        System.out.println("3 - main started");
        new InitializationOrderDemo();
        System.out.println(STATIC_FIELD);
    }
}
