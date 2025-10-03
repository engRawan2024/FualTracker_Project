/**
 * The FuelTracker class serves as the main driver for the program.
 * It creates a Fuel object (car1) and displays its calculated fuel economy data.
 */
public class FuelTracker {

    public static void main(String[] args) {
        // 1. Define the data for the first car fill-up.
        // All variable names end with '1' as per the instructions.
        String carType1 = "2009 Toyota Prius";
        int startMiles1 = 10000;
        int endMiles1 = 10440;
        double gallonsUsed1 = 10.0;
        double pricePerGallon1 = 2.99;

        // 2. Create car1 object using the parametric constructor.
        Fuel car1 = new Fuel(carType1, endMiles1, startMiles1, gallonsUsed1, pricePerGallon1);

        // 3. Call the calculation methods to get the results.
        int distance1 = car1.calcDistance(startMiles1, endMiles1);
        double cost1 = car1.totalCost();
        double mpg1 = car1.calcKmPL(distance1, gallonsUsed1);
        double gpm1 = car1.calcLiterP100Km(distance1);

        // 4. Print the results in a user-friendly, formatted table.
        System.out.println("Gas Mileage Calculations");
        
        // Print table header
        System.out.printf("| %-18s | %-12s | %-12s | %-18s | %-12s | %-15s | %-12s | %-18s | %-18s |%n",
                "Type of Car", "Start Miles", "End Miles", "Distance (Miles)", "Gallons", "Price/Gal ($)", "Cost ($)", "Miles/Gal (MPG)", "Gal/Mile (GPM)");
        
        // Print a separator line for clarity
        System.out.println("|--------------------|----------------|----------------|----------------------|--------------|-------------------|--------------|----------------------|----------------------|");

        // Print the data for car1
        System.out.printf("| %-18s | %-12d | %-12d | %-18d | %-12.2f | %-15.2f | %-12.2f | %-18.2f | %-20.4f |%n",
                car1.getCarType(),
                car1.getStartMiles(),
                car1.getEndMiles(),
                distance1,
                car1.getGallonsUsed(),
                car1.getPricePerGallon(),
                cost1,
                mpg1,
                gpm1);
    }
}
