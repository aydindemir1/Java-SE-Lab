package dev.aydindemir.javase.fundamentals.arrays;

import java.util.Arrays;

public final class ArrayBasicsDemo {

    private ArrayBasicsDemo() {
    }

    public static void main(String[] args) {
        int[] responseTimes = {120, 98, 143, 87, 110};

        int total = 0;
        for (int responseTime : responseTimes) {
            total += responseTime;
        }

        double average = (double) total / responseTimes.length;

        System.out.println("Values : " + Arrays.toString(responseTimes));
        System.out.println("Average: " + average);
    }
}
