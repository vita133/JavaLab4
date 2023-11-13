package org.example;

/**
 * The Airplane class represents an airplane object and contains information about the model, year of manufacture, price,
 * seating capacity, and manufacturer of the airplane.
 */
public class Airplane {
    private String model;
    private int year;
    private double price;
    private int seatingCapacity;
    private String manufacturer;

    /**
     * Constructor for creating an Airplane object with specified parameters.
     *
     * @param model           The model of the airplane.
     * @param year            The year of manufacture of the airplane.
     * @param price           The price of the airplane.
     * @param seatingCapacity The seating capacity of the airplane.
     * @param manufacturer    The manufacturer of the airplane.
     */
    public Airplane(String model, int year, double price, int seatingCapacity, String manufacturer) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.seatingCapacity = seatingCapacity;
        this.manufacturer = manufacturer;
    }

    // Getters and setters for class fields
    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
