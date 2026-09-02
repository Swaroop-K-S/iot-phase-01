package day10;

public class Train_Activity {
    
    public static void main(String[] args) {
        int[] arrival = {9, 9, 10,10,11};
        int[] departure = {10,11, 10, 11, 12};
        int lastDeparture = departure[0];
        System.out.println("Selected Train: 1");
        for (int i = 1; i < arrival.length; i++) {
            if (arrival[i] >= lastDeparture) {
                System.out.println("Selected Train: " + (i + 1));

                lastDeparture = departure[i];
            }
        }}
}