package application9;

public class Car {

    public static final double TAX = 0.2;

    public static double fuelAmount;

    public static double totalPrice(double price){
        return price * (fuelAmount + (fuelAmount * TAX));
    }

    public static double distanceCalculator(double consumptionPerLiter){
        return consumptionPerLiter * fuelAmount;
    }



}
