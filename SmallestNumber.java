import java.util.Scanner;

 class SmallestNumber {
    public static void main(String[] args) {
        // Create a Scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        // Take input of three numbers from the user
        System.out.print("Enter the first number: ");
        int first = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int second = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int third = scanner.nextInt();

        // Check if the first number is the smallest
        if (first < second && first < third) {
            System.out.println(first + " is the smallest among the three numbers.");
        } else {
            System.out.println(first + " is not the smallest among the three numbers.");
        }

        // Close the scanner
        scanner.close();
    }
}
