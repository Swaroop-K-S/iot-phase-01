package day10;

public class Fractional_knapsack {

    public static void main(String[] args) {

        int capacity = 10;

        int[] weight = {5, 10, 4};
        int[] profit = {100, 120, 80};

        double total = 0;
        capacity = capacity - weight[0];
        total = total + profit[0];
        System.out.println("Item 1 selected");

        capacity = capacity - weight[2];
        total = total + profit[2];
        System.out.println("Item 3 selected");

        double profitPerKg = (double) profit[1] / weight[1];

        total = total + (capacity * profitPerKg);

        System.out.println("Item 2: 1 kg selected");
        System.out.println("Total Weight = 10 kg");
        System.out.println("Total Profit = " + total);
    }
}