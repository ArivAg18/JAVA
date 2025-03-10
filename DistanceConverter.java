import java.util.Scanner;

class DistanceConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for distance in feet
        System.out.print("Enter the distance in feet: ");
        double feet = scanner.nextDouble();

        // Converting feet to yards
        double yards = feet / 3;

        // Converting yards to miles
        double miles = yards / 1760;

        // Displaying the results
        System.out.println("\nDistance Conversions:");
        System.out.println("In yards: " + yards + " yd");
        System.out.println("In miles: " + miles + " mi");

        scanner.close();
    }
}
