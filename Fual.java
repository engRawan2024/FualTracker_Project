/**
 * The Fuel class models the data and calculations for a single car fill-up.
 * It stores information like car type, mileage, and fuel consumption.
 */
public class Fuel {

    // Private instance variables to store the fuel data
    private String carType;
    private int startMiles;
    private int endMiles;
    private double gallonsUsed;
    private double pricePerGallon;

    /**
     * Default constructor initializes an empty Fuel object.
     */
    public Fuel() {
        // You can initialize with default values if needed, e.g., carType = "Unknown";
    }

    /**
     * Parametric constructor to initialize a Fuel object with provided values.
     * @param type The type or model of the car.
     * @param end The ending mileage for the trip.
     * @param start The starting mileage for the trip.
     * @param gallons The amount of fuel used in gallons.
     * @param price The price per gallon of fuel.
     */
    public Fuel(String type, int end, int start, double gallons, double price) {
        this.carType = type;
        this.endMiles = end;
        this.startMiles = start;
        this.gallonsUsed = gallons;
        this.pricePerGallon = price;
    }

    // --- GETTER AND SETTER METHODS ---
    // These methods allow access and modification of the private instance variables.

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public int getStartMiles() {
        return startMiles;
    }

    public void setStartMiles(int startMiles) {
        this.startMiles = startMiles;
    }

    public int getEndMiles() {
        return endMiles;
    }

    public void setEndMiles(int endMiles) {
        this.endMiles = endMiles;
    }

    public double getGallonsUsed() {
        return gallonsUsed;
    }

    public void setGallonsUsed(double gallonsUsed) {
        this.gallonsUsed = gallonsUsed;
    }

    public double getPricePerGallon() {
        return pricePerGallon;
    }

    public void setPricePerGallon(double pricePerGallon) {
        this.pricePerGallon = pricePerGallon;
    }

    // --- CALCULATION METHODS ---

    /**
     * Calculates the total distance driven.
     * @param startKms The starting mileage.
     * @param endKms The ending mileage.
     * @return The total distance as an integer.
     */
    public int calcDistance(int startKms, int endKms) {
        return endKms - startKms;
    }

    /**
     * Calculates the fuel economy in Miles Per Gallon (MPG).
     * The header specifies km/L, but the logic is identical for MPG.
     * @param dist The distance driven.
     * @param liters The gallons of fuel used.
     * @return The fuel economy as a double.
     */
    public double calcKmPL(int dist, double liters) {
        // To avoid integer division, cast one of the operands to double
        return (double) dist / liters;
    }

    /**
     * Calculates the fuel consumption in Gallons Per Mile (GPM).
     * The header specifies L/100km, but the sample output requires GPM.
     * This method uses the object's internal 'gallonsUsed' value.
     * @param dist The distance driven.
     * @return The fuel consumption in GPM as a double.
     */
    public double calcLiterP100Km(int dist) {
        return this.gallonsUsed / dist;
    }

    /**
     * Calculates the total cost of the fill-up.
     * This method uses the object's internal values for gallons and price.
     * @return The total fill-up cost as a double.
     */
    public double totalCost() {
        return this.gallonsUsed * this.pricePerGallon;
    }
}
