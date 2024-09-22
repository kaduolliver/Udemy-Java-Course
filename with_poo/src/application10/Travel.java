package application10;

public class Travel {
    
    public static final double TOLL = 10.5; 

    public static int toll(double distance){
        return (int) (distance/100);
    }

    public static double consump(double distance, double consumption){
        return  distance / consumption;
    }

    public static double totalCost(double result, double fuelPrice, double cost){
        return (result * TOLL) + (fuelPrice * cost); 
    }
}
