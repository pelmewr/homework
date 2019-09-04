package homework;

public class Car {

    public String mark;
    public String model;
    public String color;
    public double distance;
    public double mass;
    public boolean accident;
    private Engine carEngine;

    public double getFuelSpent() {
        return carEngine.fuel * this.distance / 100;
    }

    public Car(String mark, String model, String color, double distance, double mass, boolean accident, Engine carEngine) {
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.distance = distance;
        this.mass = mass;
        this.accident = accident;
        this.carEngine = carEngine;
    }

    public static void Signal() {
        System.out.println("БИИИИИП");
    }

    public static void Vol() {
        Engine carEngine = new Engine(true, 1.6, 82, 7.6);
        Car newCar = new Car("Lada", "Granta", "Blue", 12342, 1135, false, carEngine);

        System.out.println("Потрачено бензина: " + newCar.getFuelSpent() + " " + "Литров");
    }

    public static void main(String[] args) {
        Signal();
        Vol();
    }

}
