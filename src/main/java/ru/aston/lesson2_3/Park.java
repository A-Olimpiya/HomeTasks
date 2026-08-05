package ru.aston.lesson2_3;

import java.util.ArrayList;
import java.util.List;

public class Park {
    private String name;
    private List<Attraction> attractions;

    public Park(String name) {
        this.name = name;
        this.attractions = new ArrayList<Attraction>();
    }

    public void addAttraction(String attractionName, String workingHours, double price) {
        Attraction attraction = new Attraction(attractionName, workingHours, price);
        attractions.add(attraction);
    }

    public void printInfoParkAttractions() {
        System.out.println("Парк: " + name);
        for (Attraction attraction : attractions) {
            attraction.infoParkAttractions();
        }
    }

    public static class Attraction {
        private String attractionName;
        private String workingHours;
        private double price;

        public Attraction(String attractionName, String workingHours, double price) {
            this.attractionName = attractionName;
            this.workingHours = workingHours;
            this.price = price;
        }

        public void infoParkAttractions() {
            System.out.println("\nАттракцион: " + attractionName +
                    "\nВремя работы: " + workingHours +
                    "\nСтоимость: " + price + " руб.");
        }
    }
}
