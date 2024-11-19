//You can create the files .java it's your choice i mention the comment.
// Vehicle.java
interface Vehicle {
    void drive();
}

// Car.java
class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a car!");
    }
}

// Bike.java
class Bike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Riding a bike!");
    }
}

// VehicleFactory.java
abstract class VehicleFactory {
    public abstract Vehicle createVehicle();
}

// CarFactory.java
class CarFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}

// BikeFactory.java
class BikeFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Bike();
    }
}


public class FactoryPattern {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle();
        car.drive();  // Output: Driving a car!

        VehicleFactory bikeFactory = new BikeFactory();
        Vehicle bike = bikeFactory.createVehicle();
        bike.drive();  // Output: Riding a bike!
    }
}
