package day12;

public class maxprofit {
    public static void main(String[] args) {

        int[] price = { 7, 1, 5, 3, 6, 4 };

        int min = price[0];
        int profit = 0;
        int buy = 0, sell = 0;

        for (int i = 1; i < price.length; i++) {

            if (price[i] - min > profit) {
                profit = price[i] - min;
                sell = i;
                buy = 0;
            }

            if (price[i] < min)
                min = price[i];
        }

        System.out.println("Max Profit = " + profit);
        System.out.println("Buy Day = " + (buy + 1));
        System.out.println("Sell Day = " + (sell + 1));
    }
}
