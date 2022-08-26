package day34_custom_classes.market;

import day34_custom_classes.market.House;

public class Market {
    public static void main(String[] args) {


        House house1 = new House();
        System.out.println(house1);

        house1.type = "Townhouse";
        house1.squareFeet = 130.6;
        house1.numberOfBedrooms = 2;
        house1.numberOfBathrooms = 3;
        house1.inCity = false;
        house1.hasGarage = true;

        System.out.println(house1); // dont need toString() , because its automatically called

        System.out.println("$"+house1.calculateMortgage());

    }
}
