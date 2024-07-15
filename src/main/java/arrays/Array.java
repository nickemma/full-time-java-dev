package arrays;

import java.util.Random;
import java.util.HashSet;

public class Array {

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args) {
        int[] ticket = generateNumber();
        for (int number : ticket) {
            System.out.print(number + " | ");
        }
    }

    public static int[] generateNumber() {
        int[] ticket = new int[LENGTH];
        Random random = new Random();
        HashSet<Integer> generatedNumbers = new HashSet<>();

        for (int i = 0; i < LENGTH; i++) {
            int randomNumber;
            do {
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            } while (generatedNumbers.contains(randomNumber));
            ticket[i] = randomNumber;
            generatedNumbers.add(randomNumber);
        }

        return ticket;
    }
}
