
class Vehicle {
    void fuelType() {
        System.out.println("Vehicle uses fuel");
    }
}

class Car extends Vehicle {
    void numberOfWheels() {
        System.out.println("Car has 4 wheels");
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.fuelType();
        myCar.numberOfWheels();
    }
}
