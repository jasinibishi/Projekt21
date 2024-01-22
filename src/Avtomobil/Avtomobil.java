package Avtomobil;

public class Avtomobil {
    private String make;
    private String model;
    private int year;

    // Default Constructor
    public Avtomobil() {
        this.make = "Mercedes-Benz";
        this.model = "S500";
        this.year = 2023;
    }

    // Parameterized Constructor
    public Avtomobil(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Getter methods
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public static void main(String[] args) {
        // Creating instances of Car using both constructors
        Avtomobil defaultCar = new Avtomobil();
        Avtomobil customCar = new Avtomobil("Toyota", "Supra", 1994);

        // Displaying information about the cars
        System.out.println("Default Car - Make: " + defaultCar.getMake() +
                ", Model: " + defaultCar.getModel() +
                ", Year: " + defaultCar.getYear());

        System.out.println("Custom Car - Make: " + customCar.getMake() +
                ", Model: " + customCar.getModel() +
                ", Year: " + customCar.getYear());
    }
}