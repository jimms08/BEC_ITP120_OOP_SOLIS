public class Car extends Vehicle {
    int wheels;

    public Car(String type, int year, int wheels) {
        super(type, year); // Call the base class constructor with parameters
        this.wheels = wheels;
    }

    @Override
    public void start() {
        super.start(); // Call the base class method
        System.out.println("It has " + wheels + " wheels.");
    }

    public void accelerate() {
        System.out.println(year + " " + type + " is accelerating.");
    }
}