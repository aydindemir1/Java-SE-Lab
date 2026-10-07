package dev.aydindemir.javase.fundamentals.methods;

public final class VarargsDemo {

    private VarargsDemo() {
    }

    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(sum(10));
        System.out.println(sum(10, 20, 30));
    }

    static int sum(int... values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }
}
