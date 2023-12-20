package Vehicles;
import Details.Engine;
import Professions.Driver;
public class SportCar extends Car {
    public int speed;

    public SportCar(String carBrand, String carClass, int weight, Driver driver, Engine motor, int speed) {
        super(carBrand, carClass, weight, driver, motor);
        this.speed = speed;
    }
}
