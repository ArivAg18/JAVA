class courseFee {
    public static void main(String[] args) {

        double fee = 125000;
        double discountPercent = 10;

        double discount = (discountPercent / 100) * fee;

        double discountedPrice = fee - discount;

        System.out.println("Original Course Fee: INR " + fee + 
                           "\nDiscount Percentage: " + discountPercent + "%" + 
                           "\nDiscount Amount: INR " + discount + 
                           "\nFinal Price to Pay: INR " + discountedPrice);
    }
}
