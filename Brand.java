//Superclass Vehicle
class Vehicle {
    String brand;
    int speed;
    
    //Constructor for Vehicle
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Common method to display speed
    public void printSpeed() {
        System.out.println("Speed: " + speed + " km/h");
    }
}

// Subclass Car extending Vehicle
class Car extends Vehicle {
    String model;

    // Constructor for Car
    public Car(String brand, int speed, String model) {
        super(brand, speed); // Calling superclass constructor
        this.model = model;
    }

    public void printCarDetails() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Model: " + model);
        printSpeed();
    }
}

// Subclass Bike extending Vehicle
class Bike extends Vehicle {
    boolean isSportBike;

    // Constructor for Bike
    public Bike(String brand, int speed, boolean isSportBike) {
        super(brand, speed); // Calling superclass constructor
        this.isSportBike = isSportBike;
    }

    public void printBikeDetails() {
        System.out.println("Bike Brand: " + brand);
        System.out.println("Sport Bike: " + (isSportBike ? "Yes" : "No"));
        printSpeed();
    }
}

// Main class to test the program
public class Brand {
    public static void main(String[] args) {
        // Creating Car object
        Car myCar = new Car("Tata", 180, "Safari");
        myCar.printCarDetails();

        System.out.println();

        // Creating Bike object
        Bike myBike = new Bike("Kawasaki", 220, true);
        myBike.printBikeDetails();
    }
}
