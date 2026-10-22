package lk.kaushalya.practical;

/*
 *
 *
 * Practical 10
 * Prototype Pattern
 *
 * Prototype pattern cloning of an existing object instead of creating a new one and can also be customized as per the requirement.
 *
 * 1. Draw class diagram to prototype pattern.
 * 2. Write a program to demonstrate the Car Prototyping.
 *
 * (Car Attributes: Year, Color, Brand, Model, Engine Type, Body Type, Fuel Type, Price)
 */

interface  Prototype {
    public Prototype clone();
}

class Car implements Prototype{

    private String color;
    private String brand;
    private String model;
    private String engineType;
    private String bodyType;
    private String fuelType;
    private Double price;
    private Integer year;

    public Car(String color, String brand, String model, String engineType, String bodyType, String fuelType,
               Double price, Integer year) {
        this.color = color;
        this.brand = brand;
        this.model = model;
        this.engineType = engineType;
        this.bodyType = bodyType;
        this.fuelType = fuelType;
        this.price = price;
        this.year = year;
    }

    @Override
    public Car clone() {
        return new Car(this.color, this.brand, this.model, this.engineType, this.bodyType, this.fuelType,
                this.price, this.year);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void displayCarDetails() {
        System.out.println();
        System.out.println("Car Details:");
        System.out.println("Color: " + color);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Engine Type: " + engineType);
        System.out.println("Body Type: " + bodyType);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Price: $" + price);
        System.out.println("Year: " + year);
        System.out.println("Object: " + this);
    }
}

public class Practical {
    public static void main(String[] args) {
        Car car1 = new Car("Blue", "BMW", "i4", "eDrive40", "Hatchback", "Electric", 81000.00, 2026);
        Car car2 = car1.clone();
        car2.setColor("Matte Black");
        car2.setBrand("Tesla");
        car2.setModel("Model S");
        car2.setEngineType("Performance");
        car2.setBodyType("Sedan");
        car2.setPrice(85000.00);

        Car car3 = car1.clone();
        car3.setColor("White");
        car3.setYear(2025);
        car3.setPrice(75000.00);



        car1.displayCarDetails();
        car2.displayCarDetails();
        car3.displayCarDetails();

    }
}
