abstract class Vehicle {
    abstract void move();
}

class Car extends Vehicle {
    public void move() { System.out.println("The car drives on four wheels."); }
}

class Bicycle extends Vehicle {
    public void move() { System.out.println("The bicycle rolls on two wheels."); }
}

public class Task1 {
    public static void main(String[] args) {
        Vehicle[] vehicles = { new Car(), new Bicycle() };
        for (Vehicle v : vehicles) {
            v.move();
        }
    }
}
