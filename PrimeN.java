public class PrimeN {
    public static void main(String[] args) {
        int number = 6; // Change this value to check other numbers
        boolean isPrime = true; // Assume the number is prime initially

        // Numbers less than 2 are not prime
        if (number < 2) {
            isPrime = false;
        } else {
            // Check divisibility from 2 to number - 1
            for (int i = 2; i < number; i++) {
                if (number % i == 0) { // If number is divisible by i
                    isPrime = false; // It's not a prime number
                    break; // Exit the loop early
                }
            }
        }

        // Print the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
