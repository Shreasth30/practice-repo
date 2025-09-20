class Car {
    String model;
    int speed;
    void display() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Speed: " + speed + " km/h");
    }
}

public class carspeed {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.model = "Toyota Corolla";
        myCar.speed = 120;

        
        System.out.println("Displaying Car Information:");
        myCar.display();
    }
}