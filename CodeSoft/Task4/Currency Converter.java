package Task4;


import java.util.Scanner;

public class CurrencyConverter{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Available Currencies: 1. USD 2. EUR 3. INR");
        System.out.print("Enter base currency (1-3): ");
        int baseCurrency = scanner.nextInt();

        System.out.print("Enter target currency (1-3): ");
        int targetCurrency = scanner.nextInt();

        System.out.print("Enter amount to convert: ");
        double amount = scanner.nextDouble();

        double exchangeRate = getExchangeRate(baseCurrency, targetCurrency);
        if (exchangeRate != 0) {
            double convertedAmount = amount * exchangeRate;
            System.out.println("Converted Amount: " + convertedAmount);
        } else {
            System.out.println("Invalid currency selection.");
        }
        scanner.close();
    }

    private static double getExchangeRate(int base, int target) {
        // Placeholder rates
        if (base == 1 && target == 2) return 0.85; // USD to EUR
        if (base == 1 && target == 3) return 74.5; // USD to INR
        if (base == 2 && target == 1) return 1.18; // EUR to USD
        if (base == 2 && target == 3) return 87.8; // EUR to INR
        if (base == 3 && target == 1) return 0.013; // INR to USD
        if (base == 3 && target == 2) return 0.011; // INR to EUR
        return 0;
    }
}
