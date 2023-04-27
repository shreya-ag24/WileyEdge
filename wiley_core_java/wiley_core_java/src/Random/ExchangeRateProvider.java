package Random;
public class ExchangeRateProvider {
    public static void main(String[] args) {
      
        double usdToInr = 74.75;
        double usdToEur = 0.84;

     
        double amount = 100.0;
        String fromCurrency = "USD";
        String toCurrency = "INR";
        double exchangeRate;
        if (fromCurrency.equals("USD") && toCurrency.equals("INR")) {
            exchangeRate = usdToInr;
        } else if (fromCurrency.equals("USD") && toCurrency.equals("EUR")) {
            exchangeRate = usdToEur;
        } else {
            System.out.println("Exchange rate not available");
            return;
        }
        double convertedAmount = amount * exchangeRate;
        System.out.printf("%.2f %s = %.2f %s", amount, fromCurrency, convertedAmount, toCurrency);
    }
}
