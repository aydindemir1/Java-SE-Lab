package dev.aydindemir.javase.fundamentals.strings;

public final class TextBlockDemo {

    private TextBlockDemo() {
    }

    public static void main(String[] args) {
        String json = """
                {
                  "language": "Java",
                  "edition": "Java SE",
                  "focus": "Core Java"
                }
                """;

        System.out.println(json);
    }
}
