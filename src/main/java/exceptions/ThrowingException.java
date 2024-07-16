package exceptions;

public class ThrowingException {

    public static double calculatePay(double hours, double payRate) throws NegativeInputException {
        if(hours > 40) {
            throw new IllegalArgumentException("Hours must be less than or equal to 40");
        } else if (hours < 0 || payRate < 0) {
            throw new NegativeInputException();
        }

        return hours * payRate;
    }

    public static void main(String[] args) throws NegativeInputException {
        System.out.println(calculatePay(30, 1000)) ;
    }
}
