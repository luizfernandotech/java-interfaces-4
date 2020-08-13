package application;

import services.BrazilInterestService;
import services.UsaInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Amount: ");
        double amount = scanner.nextDouble();

        System.out.println("Months: ");
        int months = scanner.nextInt();

        BrazilInterestService brazilInterestService = new BrazilInterestService(2.0);
        double paymentBrazil = brazilInterestService.payment(amount, months);

        System.out.println("Payment after " + months + " months - Brazil");
        System.out.println(String.format("%.2f", paymentBrazil));

        System.out.println();

        UsaInterestService usaInterestService = new UsaInterestService(1.0);
        double paymentUsa = usaInterestService.payment(amount, months);

        System.out.println("Payment after " + months + " months - USA");
        System.out.println(String.format("%.2f", paymentUsa));

        scanner.close();
    }
}
