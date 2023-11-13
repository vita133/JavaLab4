package org.example;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Airplane> airplanes = new ArrayList<>();
        airplanes.add(new Airplane("Boeing 747", 2000, 150000000.0, 416, "Boeing"));
        airplanes.add(new Airplane("Airbus A320", 2010, 80000000.0, 180, "Airbus"));
        airplanes.add(new Airplane("Embraer E190", 2015, 45000000.0, 114, "Embraer"));
        airplanes.add(new Airplane("Bombardier CRJ-900", 2012, 35000000.0, 90, "Bombardier"));
        airplanes.add(new Airplane("Cessna 172", 1990, 500000.0, 4, "Cessna"));

        AirplaneSorter sorter = new AirplaneSorter();

        ArrayList<Airplane> sortedAirplanes = sorter.sortByFieldAscending("year", airplanes);

        System.out.println("Sorting by year in ascending order:");
        for (Airplane airplane : sortedAirplanes) {
            System.out.println(airplane.getModel() + " - " + airplane.getYear());
        }

        ArrayList<Airplane> sortedAirplanes2 = sorter.sortByFieldDescending("year", airplanes);

        System.out.println("\nSorting by year in descending order:");
        for (Airplane airplane : sortedAirplanes2) {
            System.out.println(airplane.getModel() + " - " + airplane.getYear());
        }
    }
}
