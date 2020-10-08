package nl.novi.javaprogrammeren.two.sub;

public class Phone {
    private String brand;

    public Phone(String brand) {
        this.brand = brand;
    }

    // Methode moet access modifier public krijgen.
    public String getBrand() {
        return brand;
    }
}
