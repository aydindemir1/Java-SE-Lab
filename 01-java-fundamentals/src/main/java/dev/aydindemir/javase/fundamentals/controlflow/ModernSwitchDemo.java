package dev.aydindemir.javase.fundamentals.controlflow;

public final class ModernSwitchDemo {

    private ModernSwitchDemo() {
    }

    public static void main(String[] args) {
        int statusCode = 404;

        String category = switch (statusCode) {
            case 200, 201, 204 -> "SUCCESS";
            case 400, 401, 403, 404 -> "CLIENT_ERROR";
            case 500, 502, 503 -> "SERVER_ERROR";
            default -> "OTHER";
        };

        System.out.println(category);
    }
}
