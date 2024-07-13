package reptition_structure;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String[] args) {
        double rate = 15;
        double maxHour = 40;

        System.out.println("How many hours worked? ");
        Scanner scanner = new Scanner(System.in);

        double hoursWorked = scanner.nextDouble();

        while (hoursWorked > maxHour || hoursWorked < 0) {
            System.out.println("Invalid entry. Your hours must be between 1 to 40, Try again");
            hoursWorked = scanner.nextDouble();
        }

        scanner.close();
        double grossPay = hoursWorked * rate;
        System.out.println("Gross pay: " + grossPay);
    }
}
