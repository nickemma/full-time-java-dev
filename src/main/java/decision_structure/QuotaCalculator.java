package decision_structure;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {

        int quota = 10;

        System.out.println("Enter the number of sales made?");

        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if (sales >= quota) {
            System.out.println("Congrats you've made your quota");
        } else {
            int saleShort = quota - sales;
            System.out.println("You did not make your quota: " + "you were " + saleShort + " sales short");
        }
    }
}
