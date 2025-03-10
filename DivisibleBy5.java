import java.util.Scanner;

class DivisibleBy5 {
    public static void main(String[] args) {
        // Create a Scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is divisible by 5
        if (number % 5 == 0) {
            System.out.println(number + " is divisible by 5.");
        } else {
            System.out.println(number + " is not divisible by 5.");
        }

        // Close the scanner
        scanner.close();
    }
}
