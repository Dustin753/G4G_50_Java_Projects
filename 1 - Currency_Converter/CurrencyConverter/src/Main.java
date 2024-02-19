import java.util.Scanner;

public class Main {
    final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    public void run(){
        System.out.println("Welcome to Currency Converter 1.0!");

        // STEP 1: Get user's current currency
        System.out.print("Enter name of currency to convert (ex. USD): ");
        // TODO if currency valid...

        // STEP 2: Get amount user wants to convert
        System.out.print("Enter amount to convert: ");
        String userCurrencyStr = scanner.nextLine();
        double userCurrency = Double.parseDouble(userCurrencyStr);

        // STEP 3: Get user's desired currency
        System.out.print("Enter name of currency to convert to (Ex. CAD): ");
        // TODO if currency valid and != to current currency...


        // STEP 4: Convert
    }



}