   class CurrencyConverter{

    // Convert INR to USD
    public double convert(double amount) {
        return amount * 0.012; // Example rate
    }

    // Convert INR to specified currency
    public double convert(double amount, String toCurrency) {
        switch (toCurrency.toUpperCase()) {
            case "USD": return amount * 0.012;
            case "EUR": return amount * 0.011;
            default: throw new IllegalArgumentException("Unsupported currency: " + toCurrency);
        }
    }
   // Convert between any two currencies
    public double convert(String fromCurrency, String toCurrency, double amount) {
        double rate = 1.0;

        if (fromCurrency.equalsIgnoreCase("INR") && toCurrency.equalsIgnoreCase("USD")) {
            rate = 0.012;
        } else if (fromCurrency.equalsIgnoreCase("INR") && toCurrency.equalsIgnoreCase("EUR")) {
            rate = 0.011;
        } else if (fromCurrency.equalsIgnoreCase("USD") && toCurrency.equalsIgnoreCase("INR")) {
            rate = 82.75;
        } else if (fromCurrency.equalsIgnoreCase("EUR") && toCurrency.equalsIgnoreCase("INR")) {
            rate = 89.65;
        } else {
            throw new IllegalArgumentException("Unsupported currency pair");
        }

        return amount * rate;
    }
public class Poly_load_5 {
     public static void main(String[] args) {
        CurrencyConverter cc = new CurrencyConverter();
        System.out.println("INR to USD: " + cc.convert(1000));
        System.out.println("INR to EUR: " + cc.convert(1000, "EUR"));
        System.out.println("USD to INR: " + cc.convert("USD", "INR", 100));
}
}
