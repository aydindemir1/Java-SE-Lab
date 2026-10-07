package dev.aydindemir.javase.fundamentals.types;

public final class PrimitiveTypesDemo {

    private PrimitiveTypesDemo() {
    }

    public static void main(String[] args) {
        byte smallNumber = 100;
        short mediumNumber = 30_000;
        int population = 85_000_000;
        long worldPopulation = 8_100_000_000L;

        float ratio = 0.75F;
        double price = 1_999.99;

        char grade = 'A';
        boolean active = true;

        System.out.println("byte   : " + smallNumber);
        System.out.println("short  : " + mediumNumber);
        System.out.println("int    : " + population);
        System.out.println("long   : " + worldPopulation);
        System.out.println("float  : " + ratio);
        System.out.println("double : " + price);
        System.out.println("char   : " + grade);
        System.out.println("boolean: " + active);
    }
}
