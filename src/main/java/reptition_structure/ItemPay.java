package reptition_structure;

import java.util.Scanner;

public class ItemPay {
    public static void main(String[] args) {
        System.out.println("How many items do you wish to purchase? ");
        Scanner scanner = new Scanner(System.in);

        int quantity = scanner.nextInt();

        double total = 0;

        for (int i = 0; i < quantity; i++) {
            System.out.println("Enter the cost of the item? ");
            double price = scanner.nextDouble();

            total = total + price;
        }

        scanner.close();
        System.out.println("Your total price is: " + total);

    }
}
