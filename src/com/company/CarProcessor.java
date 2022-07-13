package com.company;

public class CarProcessor {

    public void searchByName (Car[] cars, String name) {
        int carNumber = 1;
        System.out.println("Search for cars with a name \"" + name + "\":");
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].name.equals(name)) {
                System.out.println(carNumber + ". " + "Name: " + cars[i].name + "; " +
                        "Model: " + cars[i].model + "; " +
                        "Year: " + cars[i].year + "; " +
                        "Color: " + cars[i].color + "; " +
                        "Price: " + cars[i].price + " USD; " +
                        "Registration number: " + cars[i].regNumber + ";");
                carNumber++;
            }
        }
        if (carNumber == 1) {
            System.out.println("Not found");
        }
        System.out.println();
    }

    public void searchByModel (Car[] cars, String model, int yearsOperation) {
        int currentYear = 2022;
        int carNumber = 1;
        System.out.println("Search for cars with a model \"" + model + "\", that has been in operation for more than \"" + yearsOperation + "\" years:");
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].model.equals(model) && yearsOperation < currentYear - cars[i].year) {
                System.out.println(carNumber + ". " + "Name: " + cars[i].name + "; " +
                        "Model: " + cars[i].model + "; " +
                        "Year: " + cars[i].year + "; " +
                        "Color: " + cars[i].color + "; " +
                        "Price: " + cars[i].price + " USD; " +
                        "Registration number: " + cars[i].regNumber + ";");
                carNumber++;
            }
        }
        if (carNumber == 1) {
            System.out.println("Not found");
        }
        System.out.println();
    }

    public void searchByYear (Car[] cars, int year, double price) {
        int carNumber = 1;
        System.out.println("Search for cars with a year \"" + year + "\", whose price is more than \"" + price + " USD\":");
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].year == year && cars[i].price > price) {
                System.out.println(carNumber + ". " + "Name: " + cars[i].name + "; " +
                        "Model: " + cars[i].model + "; " +
                        "Year: " + cars[i].year + "; " +
                        "Color: " + cars[i].color + "; " +
                        "Price: " + cars[i].price + " USD; " +
                        "Registration number: " + cars[i].regNumber + ";");
                carNumber++;
            }
        }
        if (carNumber == 1) {
            System.out.println("Not found");
        }
        System.out.println();
    }
}
