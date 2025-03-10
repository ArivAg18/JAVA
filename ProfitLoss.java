class ProfitLoss {
    public static void main(String[] args) {
        // Given values
        double costPrice = 129;
        double sellingPrice = 191;

        // Calculate profit or loss
        double profit = sellingPrice - costPrice;
        double profitPercentage = (profit / costPrice) * 100;

        // Print the results in a single statement using multi-line text
        System.out.println("Cost Price: INR " + costPrice + "\n" +
                           "Selling Price: INR " + sellingPrice + "\n" +
                           "Profit: INR " + profit + "\n" +
                           "Profit Percentage: " + profitPercentage + "%");
    }
}
