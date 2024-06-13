public class Main {
    public static void main(String[] args) {

        Driver driver1 = new Driver("Игорь Иванович", 1, 3);
        Driver driver2 = new Driver("Виталий Владимирович", 3, 3);

        Engine engine1 = new Engine(300, "Производитель 1");
        Engine engine2 = new Engine(400, "Производитель 2");

        Car car1 = new Car("BMW", CarClass.B, 1200, driver1, engine1);
        Car car2 = new Car("Toyota", CarClass.BE, 1100, driver2, engine2);

        Lorry lorry1 = new Lorry("Opel", 2000, driver1, engine1, 2000);
        Lorry lorry2 = new Lorry("Skoda", 2000, driver1, engine1, 2500);

        SportCar sportCar1 = new SportCar("Ford", 2000, driver1, engine1, 500);
        SportCar sportCar2 = new SportCar("Honda", 2000, driver1, engine1, 400);

        System.out.println(driver1);
        System.out.println(driver2);
        System.out.println(engine1);
        System.out.println(engine2);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(lorry1);
        System.out.println(lorry2);
        System.out.println(sportCar1);
        System.out.println(sportCar2);
    }
}
