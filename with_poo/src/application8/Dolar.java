package application8;

public class Dolar {

    public static double price;

    public static final double IOF = 0.06;

    public static double converter(double buy){
        return price * buy + (price * buy * IOF);
    }
}
