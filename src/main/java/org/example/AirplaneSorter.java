package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * The AirplaneSorter class contains methods for sorting an array of airplane objects based on different fields.
 */
public class AirplaneSorter {
    /**
     * Sorts the array of airplanes in ascending order based on the specified field.
     *
     * @param field     The field for sorting (e.g., "model", "year", "price", "seatingCapacity").
     * @param airplanes The array of airplanes to be sorted.
     * @return The sorted array of airplanes.
     * @throws IllegalArgumentException If the sorting field is unknown.
     */
    public ArrayList<Airplane> sortByFieldAscending(String field, ArrayList<Airplane> airplanes) {
        if (airplanes == null || airplanes.isEmpty()) {
            return new ArrayList<>();
        }

        ArrayList<Airplane> sortedAirplanes = new ArrayList<>(airplanes);

        switch (field) {
            case "model":
                sortedAirplanes.sort(Comparator.comparing(Airplane::getModel));
                break;
            case "year":
                sortedAirplanes.sort(Comparator.comparingInt(Airplane::getYear));
                break;
            case "price":
                sortedAirplanes.sort(Comparator.comparingDouble(Airplane::getPrice));
                break;
            case "seatingCapacity":
                sortedAirplanes.sort(Comparator.comparingInt(Airplane::getSeatingCapacity));
                break;
            case "manufacturer":
                sortedAirplanes.sort(Comparator.comparing(Airplane::getManufacturer));
                break;
            default:
                throw new IllegalArgumentException("Unknown sorting field: " + field);
        }

        return sortedAirplanes;
    }

    /**
     * Sorts the array of airplanes in descending order based on the specified field.
     *
     * @param field     The field for sorting (e.g., "model", "year", "price", "seatingCapacity").
     * @param airplanes The array of airplanes to be sorted.
     * @return The sorted array of airplanes in descending order.
     * @throws IllegalArgumentException If the sorting field is unknown.
     */
    public ArrayList<Airplane> sortByFieldDescending(String field, ArrayList<Airplane> airplanes) {
        ArrayList<Airplane> sortedAirplanes = sortByFieldAscending(field, airplanes);
        Collections.reverse(sortedAirplanes);
        return sortedAirplanes;
    }
}
