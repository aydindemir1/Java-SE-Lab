package dev.aydindemir.javase.fundamentals.types;

import java.util.ArrayList;

public final class VarInferenceDemo {

    private VarInferenceDemo() {
    }

    public static void main(String[] args) {
        var language = "Java";
        var version = 25;
        var topics = new ArrayList<String>();

        topics.add("Generics");
        topics.add("Collections");

        System.out.println(language + " " + version);
        System.out.println(topics);
    }
}
