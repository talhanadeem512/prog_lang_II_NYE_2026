public class Car {

    private String fuelType;

    public Car(String fuelType) {
        this.fuelType = fuelType;
    }

    class Engine {
        public void start() {
            System.out.println("Starting with " + fuelType + "...");
        }
    }

    public static void main(String[] args) {
        Car car = new Car("Diesel");
        Car.Engine engine = car.new Engine();
        engine.start();
    }
}