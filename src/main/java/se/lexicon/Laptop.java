package se.lexicon;

// ASSOCIATION partner class
// Laptop exists independently — it is not created or owned by Employee.
// It is passed into Employee.use() as a parameter and used temporarily.
// When the method call ends, the connection between Employee and Laptop is gone.
public class Laptop {
    private String brand;
    private String model;

    public Laptop(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() { return brand; }
    public String getModel() { return model; }

    public String getDetails() {
        return brand + " " + model;
    }
}