//Method 1
public class TaxUtil {
    private static final double RATE = 0.15;

    public double calculateTax(double amount) {
        return amount * RATE;
    }
}

//Method 2
//public class TaxUtil {
//    public double calculateTax(double amount, double rate) {
//        return amount * rate;
//    }
//}


