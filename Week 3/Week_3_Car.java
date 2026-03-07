import java.util.Scanner;

class Car {
    String brand;
    String model;
    int year;
    
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    
    //Method for printing out details of car
    void displayInfo() {
        System.out.println("Car Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
    
    //Method for engine start
    void startEngine() {
        System.out.println("The car is starting!");
    }
    
    //Method for engine stop
    void stopEngine() {
        System.out.println("The car is stopping!");
    }
}

public class Main {
    
    public static void main(String[] args) {
        
        Car myCar = new Car("Toyota", "Camry", 2023);
        
        myCar.displayInfo();
        System.out.println();
        
        myCar.startEngine();
        myCar.stopEngine();
    }
}