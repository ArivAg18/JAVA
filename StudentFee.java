import java.util.Scanner; // Import Scanner class

 class StudentFee {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double fee, discountPercent, discountAmount, finalAmount;

        System.out.print("Enter the total course fee (INR): ");
        fee = input.nextDouble();

        System.out.print("Enter the discount percentage: ");
        discountPercent = input.nextDouble();

        discountAmount = (discountPercent / 100) * fee;

        finalAmount = fee - discountAmount;

        System.out.println("\nOriginal Course Fee: INR " + fee + 
                           "\nDiscount Percentage: " + discountPercent + "%" + 
                           "\nDiscount Amount: INR " + discountAmount + 
                           "\nFinal Price to Pay: INR " + finalAmount);

        // Close Scanner
        input.close();
    }
}
