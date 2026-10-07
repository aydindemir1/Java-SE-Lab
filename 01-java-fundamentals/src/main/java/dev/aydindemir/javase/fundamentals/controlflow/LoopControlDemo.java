package dev.aydindemir.javase.fundamentals.controlflow;

public final class LoopControlDemo {

    private LoopControlDemo() {
    }

    public static void main(String[] args) {
        System.out.println("for:");
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("while:");
        int value = 0;
        while (value < 3) {
            System.out.println(value++);
        }

        System.out.println("do-while:");
        int attempts = 0;
        do {
            attempts++;
            System.out.println("attempt " + attempts);
        } while (attempts < 2);

        System.out.println("labeled break:");
        outer:
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                if (row == 1 && column == 1) {
                    break outer;
                }
                System.out.printf("(%d,%d)%n", row, column);
            }
        }
    }
}
