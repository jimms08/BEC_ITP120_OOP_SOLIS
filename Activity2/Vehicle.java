public class Vehicle {
    String type;
    int year;

    public Vehicle(String type, int year) {
        this.type = type;
        this.year = year;
    }

    public void start() {
        System.out.println(year + " " + type + " is starting.");
    }

    public void stop() {
        System.out.println(year + " " + type + " is stopping.");
    }
}