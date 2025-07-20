interface Vehicle {
    void start();
    // Default method
    default void fuelType() {
        System.out.println("Default fuel type: Petrol");
    }
    // Static method
    static void serviceReminder() {
        System.out.println("Static: Service due in 6 months.");
    }
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    @Override
    public void fuelType() {
        System.out.println("Fuel type: Diesel");
    }
}

public class InterfaceDefaultStatic {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();            // abstract method
        myCar.fuelType();         // overridden default method
        Vehicle.serviceReminder();
    }
}