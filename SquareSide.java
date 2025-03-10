import java.util.Scanner;

class SquareSide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the perimeter of the square: ");
        double perimeter = scanner.nextDouble();

        double side = perimeter / 4;

        System.out.println("The side length of the square is: " + side);

        scanner.close();
    }
}
