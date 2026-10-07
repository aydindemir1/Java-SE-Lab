package dev.aydindemir.javase.fundamentals.methods;

public final class PassByValueDemo {

    private PassByValueDemo() {
    }

    public static void main(String[] args) {
        int number = 10;
        changePrimitive(number);
        System.out.println("primitive after method: " + number);

        Customer customer = new Customer("Aydın");
        changeReference(customer);
        System.out.println("reference after reassignment: " + customer.name());

        renameObject(customer);
        System.out.println("object state after mutation: " + customer.name());
    }

    private static void changePrimitive(int value) {
        value = 99;
    }

    private static void changeReference(Customer value) {
        value = new Customer("Another customer");
    }

    private static void renameObject(Customer value) {
        value.rename("Updated customer");
    }

    private static final class Customer {
        private String name;

        private Customer(String name) {
            this.name = name;
        }

        private String name() {
            return name;
        }

        private void rename(String newName) {
            this.name = newName;
        }
    }
}
