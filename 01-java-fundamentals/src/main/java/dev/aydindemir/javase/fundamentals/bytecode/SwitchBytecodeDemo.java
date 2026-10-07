package dev.aydindemir.javase.fundamentals.bytecode;

public final class SwitchBytecodeDemo {

    private SwitchBytecodeDemo() {
    }

    public static String classify(int value) {
        return switch (value) {
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            default -> "OTHER";
        };
    }

    public static void main(String[] args) {
        System.out.println(classify(2));
    }
}
