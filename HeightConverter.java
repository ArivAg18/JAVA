import java.util.Scanner; // Import Scanner class

class Heightconverter {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your height in centimeters: ");
        double cm = input.nextDouble();

        double totalInches = cm / 2.54;

        int feet = (int) (totalInches / 12); // Get the whole feet
        double inches = totalInches % 12;    // Get remaining inches

        System.out.println("\nYour height is: " + feet + " feet " + String.format("%.2f", inches) + " inches.");

        input.close();
    }
}
