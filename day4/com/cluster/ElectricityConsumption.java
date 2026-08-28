package day4.com.cluster;

public class ElectricityConsumption {
    public static void main(String[] args) {
        // Array holding the electricity consumption for each of the 7 days
        int[] dailyUnits = {10, 15, 12, 20, 18, 14, 16};
        
        int totalConsumption = 0;
        
        System.out.println("Electricity Consumption log:");
        
        // Loop through the array to print each day and calculate the total
        for (int i = 0; i < dailyUnits.length; i++) {
            System.out.println("Day " + (i + 1) + " -> " + dailyUnits[i] + " units");
            totalConsumption += dailyUnits[i];
        }
        
        System.out.println("\nTotal electricity consumption for 7 days is: " + totalConsumption + " units");
    }
}

