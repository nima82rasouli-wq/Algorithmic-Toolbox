import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
public class MortgageCalculator{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter currency symbol (e.g., $, €, £, ¥, ₹):");
        String currencySymbol = scanner.nextLine();
        System.out.println("Enter annual interest rate (%)");
        float annualInterestRate = scanner.nextFloat();
        System.out.println("Enter loan amount:");
        int loanAmount = scanner.nextInt();
        System.out.println("Enter payment period (in years):");
        byte years = scanner.nextByte();
        float monthlyInterestRate  = (annualInterestRate/100) / 12;
        byte numberOfPayments = (byte) (years * 12);
        double monthlyPayment  = loanAmount * (monthlyInterestRate  * Math.pow(1 + monthlyInterestRate , numberOfPayments)) /
                (Math.pow(1 + monthlyInterestRate , numberOfPayments) - 1);
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        System.out.println("Monthly interest rate:" + String.format("%.4f", monthlyInterestRate * 100) + "%");
        System.out.println("Monthly payment: " + currencySymbol + numberFormat.format(monthlyPayment));
        System.out.println("Number of payments :" + numberOfPayments);

        scanner.close();
    }
}