package Vehicles;

import Details.Engine;
import Professions.Driver;

public class Car {
    public String carBrand, carClass;
    int weight;
    public Driver driver;
    public Engine motor;
    public Car(String carBrand, String carClass, int weight, Driver driver, Engine motor) {
        this.carBrand = carBrand;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.motor = motor;
    }
    public void start() {
        System.out.println("Let's go");
    }
    public void stop() {
        System.out.println("Let's stop");
    }
    public void turnRight() {
        System.out.println("Turn right");
    }
    public void turnLeft() {
        System.out.println("Turn left");
    }
    public String toString() {
        return String.format(
                "Car:%n" +
                        "Brand: %s%n" +
                        "Model: %s%n" +
                        "Weight: %s%n" +
                        "Pilot: %s%n" +
                        "Motor Manufacture: %s",
                carBrand,
                carClass,
                weight,
                driver.fullname,
                motor.company);
    }
}