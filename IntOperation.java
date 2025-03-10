import java.util.Scanner;

class IntOperation {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Taking integer inputs for a, b, and c
        System.out.print("Enter value for a: ");
        int a = scanner.nextInt();
        
        System.out.print("Enter value for b: ");
        int b = scanner.nextInt();
        
        System.out.print("Enter value for c: ");
        int c = scanner.nextInt();

        // Perform the integer operations with precedence consideration
        int result1 = a + b * c; // Multiplication (*) has higher precedence than addition (+)
        int result2 = a * b + c; // Multiplication (*) has higher precedence than addition (+)
        int result3 = c + a / b; // Division (/) has higher precedence than addition (+)
        int result4 = a % b + c; // Modulus (%) has same precedence as division and is evaluated first

        // Print the results
        System.out.println("Result of a + b * c: " + result1);
        System.out.println("Result of a * b + c: " + result2);
        System.out.println("Result of c + a / b: " + result3);
        System.out.println("Result of a % b + c: " + result4);

        // Close the scanner
        scanner.close();
    }
}
