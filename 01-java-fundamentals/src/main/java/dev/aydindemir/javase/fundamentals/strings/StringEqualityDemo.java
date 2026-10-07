package dev.aydindemir.javase.fundamentals.strings;

public final class StringEqualityDemo {

    private StringEqualityDemo() {
    }

    public static void main(String[] args) {
        String first = "Java";
        String second = "Java";
        String third = new String("Java");

        System.out.println("first == second      : " + (first == second));
        System.out.println("first == third       : " + (first == third));
        System.out.println("first.equals(third)  : " + first.equals(third));

        String original = "Java";
        String changed = original.concat(" SE");

        System.out.println("original: " + original);
        System.out.println("changed : " + changed);
    }
}
