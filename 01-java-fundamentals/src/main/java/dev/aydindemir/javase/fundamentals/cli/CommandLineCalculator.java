package dev.aydindemir.javase.fundamentals.cli;

public final class CommandLineCalculator {

    private CommandLineCalculator() {
    }

    public static void main(String[] args) {
        if (args.length != 3) {
            printUsage();
            return;
        }

        double left = Double.parseDouble(args[0]);
        String operator = args[1];
        double right = Double.parseDouble(args[2]);

        double result = switch (operator) {
            case "+" -> left + right;
            case "-" -> left - right;
            case "*" -> left * right;
            case "/" -> divide(left, right);
            default -> throw new IllegalArgumentException("Unsupported operator: " + operator);
        };

        System.out.println(result);
    }

    private static double divide(double left, double right) {
        if (right == 0.0) {
            throw new ArithmeticException("Division by zero");
        }
        return left / right;
    }

    private static void printUsage() {
        System.out.println("Usage: <number> <+|-|*|/> <number>");
        System.out.println("Example: 10 * 2");
    }
}
