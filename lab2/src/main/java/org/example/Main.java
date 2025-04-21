package org.example;
// Базовый класс: Транспортное средство
class Vehicle {
    private String brand;
    private String model;
    private int year;

    // Конструктор
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Геттеры и сеттеры
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Метод для вывода информации о транспортном средстве
    public void displayInfo() {
        System.out.println("Марка: " + brand);
        System.out.println("Модель: " + model);
        System.out.println("Год выпуска: " + year);
    }
}

// Дочерний класс: Легковой автомобиль
class Car extends Vehicle {
    private int numberOfDoors;

    // Конструктор
    public Car(String brand, String model, int year, int numberOfDoors) {
        super(brand, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    // Геттер и сеттер для количества дверей
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    // Переопределение метода displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Количество дверей: " + numberOfDoors);
    }
}

// Дочерний класс: Грузовой автомобиль
class Truck extends Vehicle {
    private double cargoCapacity;

    // Конструктор
    public Truck(String brand, String model, int year, double cargoCapacity) {
        super(brand, model, year);
        this.cargoCapacity = cargoCapacity;
    }

    // Геттер и сеттер для грузоподъемности
    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    // Переопределение метода displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Грузоподъемность: " + cargoCapacity + " тонн");
    }
}

// Дочерний класс: Мотоцикл
class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    // Конструктор
    public Motorcycle(String brand, String model, int year, boolean hasSidecar) {
        super(brand, model, year);
        this.hasSidecar = hasSidecar;
    }

    // Геттер и сеттер для наличия коляски
    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    // Переопределение метода displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Наличие коляски: " + (hasSidecar ? "Да" : "Нет"));
    }
}

// Пример использования
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2020, 4);
        Truck truck = new Truck("Volvo", "FH16", 2019, 20.5);
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2021, false);

        System.out.println("Информация о легковом автомобиле:");
        car.displayInfo();

        System.out.println("\nИнформация о грузовом автомобиле:");
        truck.displayInfo();

        System.out.println("\nИнформация о мотоцикле:");
        motorcycle.displayInfo();
    }
}