public class Car {
    private String brand;
    private CarClass carClass;
    private float weight;
    private Driver driver;
    private Engine engine;

    public Car(String brand, CarClass carClass, int weight, Driver driver, Engine engine) {
        this.brand = brand;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public CarClass getCarClass() {
        return carClass;
    }

    public float getWeight() {
        return weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Марка автомобиля: " + brand +
                ", Класс автомобиля: " + carClass +
                ", Вес: " + weight +
                ", Водитель: " + driver +
                ", Мотор: " + engine;
    }
}

