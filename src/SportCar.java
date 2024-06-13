public class SportCar extends Car{
    private float maxSpeed;

    public SportCar(String brand, int weight, Driver driver, Engine engine, float maxSpeed) {
        super(brand, CarClass.B, weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "Марка автомобиля: " + this.getBrand() +
                ", Класс автомобиля: " + this.getCarClass() +
                ", Вес: " + this.getWeight() +
                ", Водитель: " + this.getDriver() +
                ", Мотор: " + this.getEngine() +
                ", Предельная скорость: " + maxSpeed;
    }
}