import java.util.Scanner;
public class VivaQ3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer greater than 1: ");
        int num = scanner.nextInt();
        
        if (num < 1){
            System.out.println("Invalid input. Please enter an integer greater than 1.");
            return;
        }
        
        boolean prime = true;
       for (int i = 2; i * i <= num; i++) {
           if (num % i == 0){
               prime = false;
               break;
           }
        }
       if (prime){
           System.out.println("Integer is a prime number. ");
           System.out.println("Prime numbers between 2 and " + num + ": ");
           for (int i = 2; i < num; i++) {
                boolean primeCheck = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        primeCheck = false;
                        break;
                        }
                }
                if (primeCheck) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
            return;
       }
       else {
           System.out.println("Integer is not a prime number.");
       }
      
        int factor = 0;
        long sum = 0;
        long product = 1;
        boolean overflow = false;
        final long overflowThreshold = 1_000_000_000;

        System.out.print("The factors of this integer are: ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                factor++;
                sum += i;
                
                if (!overflow && product <= overflowThreshold / i) {
                    product *= i;
                } else {
                    overflow = true;
                }
            }
        }
        System.out.println();
        System.out.println("The integer has " + factor + " factors.");
        System.out.println("The sum of the factors is " + sum);

        if (overflow) {
            System.out.println("The product of the factors is too large to display.");
        } else {
            System.out.println("The product of the factors is " + product);
        }

        long properDivisorSum = sum - num;
        if (properDivisorSum == num) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }

        System.out.print("Prime numbers between 2 and " + num + ": ");
        for (int i = 2; i < num; i++) {
            boolean primeCheck = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    primeCheck = false;
                    break;
                }
            }
            if (primeCheck) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
