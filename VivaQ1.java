import java.util.Scanner;

public class VivaQ1 {
    public static void main(String[] args) {
        // Create a new Scanner
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Please enter a number:");

        // Name the next input (Integer) as "inputNum"
        long inputNum = sc.nextLong();

        // Calculate the sum of digits of the user input using sumOfDigit() method
        int sum = sumOfDigit(inputNum);

        // Close the scanner to avoid memory leak
        sc.close();

        // Continue summing the digits until a single digit is obtained
        while (sum >= 10) {
            sum = sumOfDigit(sum);
        }

        // Print the result
        System.out.println("Sum of digits until single digit: " + sum);
    }

    // Create a method called sumOfDigit() that returns a integer
    public static int sumOfDigit(long number) {
        int sum = 0;

        // Loop to find the sum of digits of a number
        while (number != 0) {
            // Remainder of the number when divided by 10 is the last digit
            sum += number % 10;
            // Divide the number by 10 to remove the last digit
            number /= 10;
        }

        return sum;
    }
}
