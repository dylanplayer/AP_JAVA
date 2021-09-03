class Main {

  public static void main(String[] args) {
    
    int numberOfSharesPurchased = 1000;
    int numberOfSharesSold = 1000;

    double buyPrice = 32.87;
    double sellPrice = 33.92;

    double brokerBuyCommissionPercentage = 0.02;
    double brokerSellCommissionPercentage = 0.02;

    double brokerBuyCommission = (numberOfSharesPurchased * buyPrice) * brokerBuyCommissionPercentage;
    double brokerSellCommission = (numberOfSharesSold * sellPrice) * brokerSellCommissionPercentage;

    double totalPurchasePrice =(numberOfSharesPurchased * buyPrice);
    double totalSalePrice = (numberOfSharesSold * sellPrice);

    double totalTradeProfit = (totalSalePrice) - (totalPurchasePrice + brokerBuyCommission + brokerSellCommission);

    System.out.println("Total purchase price: $" + totalPurchasePrice);
    System.out.println("Broker buy commission: $" + brokerBuyCommission);
    System.out.println("Total sale price: $" + totalSalePrice);
    System.out.println("Broker sell commission: $" + brokerSellCommission);
    System.out.print("Total profit from trade: $");
    System.out.printf("%.2f", totalTradeProfit);


  }
}