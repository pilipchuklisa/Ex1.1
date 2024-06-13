public class Lorry extends Car{
    private float loadCapacity;

    public Lorry(String brand, int weight, Driver driver, Engine engine, float loadCapacity) {
        super(brand, CarClass.C, weight, driver, engine);

        this.loadCapacity = loadCapacity;
    }

    public float getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public String toString() {
        return "Марка автомобиля: " + this.getBrand() +
                ", Класс автомобиля: " + this.getCarClass() +
                ", Вес: " + this.getWeight() +
                ", Водитель: " + this.getDriver() +
                ", Мотор: " + this.getEngine() +
                ", Грузоподъемностью кузова: " + loadCapacity;
    }
}
