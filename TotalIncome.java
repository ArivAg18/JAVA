import java.util.Scanner;

class TotalIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter salary in INR: ");
        double salary = scanner.nextDouble();
        
        System.out.print("Enter bonus in INR: ");
        double bonus = scanner.nextDouble();
        
        double totalIncome = salary + bonus;
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence, Total Income is INR " + totalIncome);
        
        scanner.close();
    }
}
