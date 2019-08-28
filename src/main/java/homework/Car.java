package homework;

import java.sql.SQLOutput;

public class Car {


    public String mark;
    public String model;
    public String color;
    public double distance;
    public double mass;
    public boolean accident;
    public double gasVolume;
    public String engine;

    public Car(String mark, String model, String color, double distance, double mass, boolean accident, double gasVolume,
    String engine){
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.distance = distance;
        this.mass = mass;
        this.accident = accident;
        this.gasVolume = gasVolume;
        this.engine = engine;
    }

    public static void main(String[] args){
        Engine carEngine;
        carEngine = new Engine(true, 1.6,82,7.6);
        Car newCar = new Car("Lada","Granta","Blue",12342,1135,false,50,"Engine1");
        System.out.println("Машина\n"+newCar.mark + " " + newCar.model+ "\n"+"Color - "+ newCar.color);
        System.out.println("БИИИИИП");
        System.out.println("Потрачено бензина: " + (carEngine.fuel*newCar.distance/100) + " " + "Литров");
    }

}
