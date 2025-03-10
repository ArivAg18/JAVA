import java.util.Scanner;

class WeightConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter weight in pounds: ");
        double pounds = scanner.nextDouble();
        
        double kilograms = pounds / 2.2;
        
        System.out.println("The weight in kilograms is " + kilograms);
        
        scanner.close();
    }
}
