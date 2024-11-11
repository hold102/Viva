
import java.util.ArrayList;
import java.util.Scanner;

public class VivaQ3 {

    // Method to find factors and return them in an ArrayList
    public static ArrayList<Integer> factors(int input) {
        ArrayList factorsArrayList = new ArrayList<>();
        for (int i = 1; i <= input; i++) {
            if (input % i == 0) {
                factorsArrayList.add(i); // Adding factors into ArrayList
            }
        }
        return factorsArrayList;
    }

    // Method to determine if input is prime
    public static boolean isPrimeNumber(int input) {
        return factors(input).size() == 2; //definition of prime number
    }

    // Method to find sum of factors
    public static int factorsSum(int input) {
        int sum = 0;
        for (int i = 1; i <= input; i++) {
            if (input % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // Method to find product of factors
    public static long factorsProduct(int input) {
        long product = 1;
        for (int i = 1; i <= input; i++) {
            if (input % i == 0) {
                product *= i;
            }
        }
        return product;
    }

    // Method to determine if input is a perfect number
    public static boolean isPerfectNum(int input) {
        return input == factorsSum(input) - input; //definition of perfectNum
    }

    // Method to list prime numbers between 2 and input
    public static ArrayList listPrimeNumber(int input) {
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        for (int i = 2; i <= input; i++) {
            if (factors(i).size() == 2) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;

        // Loop to check validity of input
        while (true) {
            System.out.println("Enter the number[Integer greater than positive one]:");
            input = sc.nextInt();

            // If the input is valid (input > 1), close the scanner to avoid memory leak
            // and break the loop to proceed.
            if (input > 1) {
                sc.close();
                break;
            } else {
                // If the input is invalid, prompt the user to re-enter
                System.out.println("Invalid input, please try again.");
            }
        }

        // Let numberOfFactors represent the number of factors obtained from the size of factors() ArrayList
        int numberOfFactors = factors(input).size();

        // Let sumOfFactors be the sum of factors from the factorsSum method
        int sumOfFactors = factorsSum(input);

        // Let productOfFactors be the product of sum from factorsProduct method
        long productOfFactors = factorsProduct(input);

        // Check if the input is a prime number
        if (!isPrimeNumber(input)) {
            // If it is not a prime number, print properties (isPrimeNumber?, list of factors, etc.)
            System.out.println(input + " is not a prime number.");
            System.out.println("Number of factors of " + input + ": " + numberOfFactors);
            System.out.println("The factors of " + input + ": " + factors(input));
            System.out.println("Sum of factors: " + sumOfFactors);

            // In case of overflow, display a message indicating the product is too large to be displayed
            if (productOfFactors == 0) {
                System.out.println("The product of factors is too large to be displayed.");
            } else {
                System.out.println("Product of factors: " + productOfFactors);

                // Check if the number is a perfect number
                if (isPerfectNum(input)) {
                    System.out.println(input + " is a perfect number");
                } else {
                    System.out.println(input + " is not a perfect number");
                }
            }
        } else {
            // If it is a prime number
            System.out.println(input + " is a prime number.");
        }

        // Print the list of prime numbers between 2 and the input
        System.out.println("The prime numbers between 2 and " + input + ": " + listPrimeNumber(input));
    }
}
