package day6;

public class HighestProfitKadane {
l
    public static int maxProfit(int[] profits) {
        if (profits == null || profits.length == 0) {
            return 0; 
        }

        // Initialize variables with the first day's profit/loss
        int maxEndingHere = profits[0];
        int maxSoFar = profits[0];

        // Loop through the rest of the days
        for (int i = 1; i < profits.length; i++) {
            // At each day, we decide whether to add the current day's profit to the existing continuous period 
            // OR start a new continuous period from the current day.
            maxEndingHere = Math.max(profits[i], maxEndingHere + profits[i]);
            
            // Keep track of the highest profit found so far
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

      
        return maxSoFar;
    }

    
    public static void printMostProfitableDay(int[] profits) {
        if (profits == null || profits.length == 0) return;
        
        int maxProfit = profits[0];
        int bestDayIndex = 0;
        
        for (int i = 1; i < profits.length; i++) {
            if (profits[i] > maxProfit) {
                maxProfit = profits[i];
                bestDayIndex = i;
            }
        }
        
        System.out.println("The single MOST profitable day was Day " + (bestDayIndex + 1) + " with a profit of " + maxProfit + ".");
    }

    public static void main(String[] args) {
       
        int[] weeklyProfits = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        
        System.out.println("Weekly profits/losses: " + java.util.Arrays.toString(weeklyProfits));
        
        int highestProfit = maxProfit(weeklyProfits);
        
        System.out.println("Highest continuous profit for the week using Kadane's Algorithm: " + highestProfit);
        
        System.out.println("------------------------- ");
        printMostProfitableDay(weeklyProfits);
    }
}
