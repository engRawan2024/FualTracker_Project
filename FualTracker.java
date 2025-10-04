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
        
        String carType2 = "2020 Honday MW";
        int startMiles2 = 10440;
        int endMiles2 = 11975;
        double gallonsUsed2 = 15.0;
        double pricePerGallon2 = 2.99;





String carType3 = "2012 Toyota Helox";
        int startMiles3 = 10875;
        int endMiles3= 11302;
        double gallonsUsed3 = 14.0;
        double pricePerGallon3 = 3.19;


        // 2. Create car1 object using the parametric constructor.
        Fuel car1 = new Fuel(carType1, endMiles1, startMiles1, gallonsUsed1, pricePerGallon1);
     // 2. Create car1 object using the parametric constructor.
        Fuel car2 = new Fuel(carType2, endMiles2, startMiles2, gallonsUsed2, pricePerGallon2);
        Fuel car3 = new Fuel(carType3, endMiles3, startMiles3, gallonsUsed3, pricePerGallon3);

        // 3. Call the calculation methods to get the results.
        int distance1 = car1.calcDistance(startMiles1, endMiles1);
        double cost1 = car1.totalCost();
        double mpg1 = car1.calcKmPL(distance1, gallonsUsed1);
        double gpm1 = car1.calcLiterP100Km(distance1);
        
        int distance2 = car2.calcDistance(startMiles2, endMiles2);
        double cost2 = car2.totalCost();
        double mpg2 = car2.calcKmPL(distance2, gallonsUsed2);
        double gpm2 = car2.calcLiterP100Km(distance2);
        
        int distance3 = car3.calcDistance(startMiles3, endMiles3);
        double cost3 = car3.totalCost();
        double mpg3 = car3.calcKmPL(distance3, gallonsUsed3);
        double gpm3 = car3.calcLiterP100Km(distance3);

        // 4. Print the results in a user-friendly, formatted table.
        System.out.println("Gas Mileage Calculations");
        
        // Print table header
        System.out.printf("| %-18s | %-12s | %-12s | %-18s | %-12s | %-15s | %-12s | %-18s | %-15s |%n",
                "Type of Car", "Start Miles", "End Miles", "Distance (Miles)", "Gallons", "Price/Gal ($)", "Cost ($)", "Miles/Gal (MPG)", "Gal/Mile (GPM)");
        
        // Print a separator line for clarity
        System.out.println("|--------------------|--------------|--------------|--------------------|--------------|-----------------|--------------|--------------------|-----------------|");

        // Print the data for car1
        System.out.printf("| %-18s | %-12d | %-12d | %-18d | %-12.2f | %-15.2f | %-12.2f | %-18.2f | %-15.4f |%n",
                car1.getCarType(),
                car1.getStartMiles(),
                car1.getEndMiles(),
                distance1,
                car1.getGallonsUsed(),
                car1.getPricePerGallon(),
                cost1,
                mpg1,
                gpm1);
     // Print the data for car2
        System.out.printf("| %-18s | %-12d | %-12d | %-18d | %-12.2f | %-15.2f | %-12.2f | %-18.2f | %-15.4f |%n",
                car2.getCarType(),
                car2.getStartMiles(),
                car2.getEndMiles(),
                distance2,
                car2.getGallonsUsed(),
                car2.getPricePerGallon(),
                cost2,
                mpg2,
                gpm2);
        // Print the data for car3
        System.out.printf("| %-18s | %-12d | %-12d | %-18d | %-12.2f | %-15.2f | %-12.2f | %-18.2f | %-15.4f |%n",
                car3.getCarType(),
                car3.getStartMiles(),
                car3.getEndMiles(),
                distance3,
                car3.getGallonsUsed(),
                car3.getPricePerGallon(),
                cost3,
                mpg3,
                gpm3);
    }
}
