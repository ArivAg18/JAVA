import java.util.Scanner;

 class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base of the triangle (in inches): ");
        double baseInches = scanner.nextDouble();

        System.out.print("Enter the height of the triangle (in inches): ");
        double heightInches = scanner.nextDouble();

        double areaInches = 0.5 * baseInches * heightInches;

        double baseCm = baseInches * 2.54;
        double heightCm = heightInches * 2.54;

        double areaCm = 0.5 * baseCm * heightCm;

        System.out.println("\nArea of the triangle:");
        System.out.println("In square inches: " + areaInches + " in²");
        System.out.println("In square centimeters: " + areaCm + " cm²");

        scanner.close();
    }
}
