package dev.aydindemir.javase.fundamentals.basics;

/**
 * En küçük klasik Java uygulaması.
 *
 * Bu örneğin amacı yalnızca ekrana yazı basmak değil;
 * source -> compile -> bytecode -> JVM execution zincirinin ilk gözlemini yapmaktır.
 */
public final class HelloJava {

    private HelloJava() {
    }

    public static void main(String[] args) {
        System.out.println("Hello, Java SE!");
    }
}
