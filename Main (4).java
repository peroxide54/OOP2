abstract class Vehicle {
    protected String brand;
    protected int year;
    
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    
    public void start() {
        System.out.println("Транспортное средство заведено");
    }
}

class Car extends Vehicle {
    private int numberOfDoors;
    
    public Car(String brand, int year, int numberOfDoors) {
        super(brand, year);
        this.numberOfDoors = numberOfDoors;
    }
    
    @Override
    public void start() {
        System.out.println("Автомобиль " + brand + " заведён");
    }
    
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String brand, int year) {
        super(brand, year);
    }
    
    @Override
    public void start() {
        System.out.println("Мотоцикл " + brand + " заведён");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2020, 4);
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", 2021);
        
        car.start();
        motorcycle.start();
    }
}