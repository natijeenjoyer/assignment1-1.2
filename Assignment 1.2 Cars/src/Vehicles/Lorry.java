package Vehicles;

import Professions.Driver;
import Details.Engine;

public class Lorry extends Car {
    int carrying;

    public Lorry(String carBrand, String carClass, int weight, Driver driver, Engine motor, int carrying) {
        super(carBrand, carClass, weight, driver, motor);
        this.carrying = carrying;
    }
}