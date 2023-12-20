import Details.Engine;
import Professions.Driver;
import Vehicles.Car;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine("Engine", 500);
        Driver driver = new Driver("Max Verstappen", 26, 10);
        Car car = new Car("McLaren", "F1", 1600, driver, engine);
        System.out.println(car);
    }
}