package dev.aydindemir.javase.fundamentals.operators;

public final class OperatorsAndExpressionsDemo {

    private OperatorsAndExpressionsDemo() {
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        boolean shortCircuit = a > 0 && expensiveCheck();
        System.out.println("shortCircuit = " + shortCircuit);

        int bitwiseAnd = 0b1100 & 0b1010;
        int bitwiseOr = 0b1100 | 0b1010;
        int bitwiseXor = 0b1100 ^ 0b1010;

        System.out.println("bitwiseAnd = " + Integer.toBinaryString(bitwiseAnd));
        System.out.println("bitwiseOr  = " + Integer.toBinaryString(bitwiseOr));
        System.out.println("bitwiseXor = " + Integer.toBinaryString(bitwiseXor));

        int shiftedLeft = 1 << 4;
        int shiftedRight = 32 >> 2;

        System.out.println("1 << 4 = " + shiftedLeft);
        System.out.println("32 >> 2 = " + shiftedRight);

        String result = a > b ? "a is greater" : "b is greater or equal";
        System.out.println(result);
    }

    private static boolean expensiveCheck() {
        System.out.println("expensiveCheck executed");
        return true;
    }
}
