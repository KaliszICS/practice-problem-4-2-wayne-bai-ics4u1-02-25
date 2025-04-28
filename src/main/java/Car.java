

public class Car {

    private String make;
    private String model;
    private int year;
    private double price;


    /**
     * Creates a new car object, which has a make, model, year and price associated with it.
     * 
     * @param make of the car
     * @param model of the car
     * @param year of the car
     * @param price of the car
     */

    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    /**
     * Returns the make of the car
     * 
     * @return      The make of the car
     */
    public String getMake() { return this.make; }

    /**
     * Returns the model of the car
     * 
     * @return      the model of the car
     */
    public String getModel() { return this.model; }

    /**
     * Returns the year of the car
     * 
     * @return      the year of the car
     */
    public int getYear() { return this.year; }

    /**
     * Returns the price of the car
     * 
     * @return      the price of the car
     */
    public double getPrice() { return this.price; }


    /**
     * Sets the make of the car
     * 
     * @param arg    for make of the car
     */
    public void setMake(String arg) { this.make = arg ; }

    /**
     * Sets the model of the car
     * 
     * @param arg   for model of the car
     */
    public void setModel(String arg) { this.model = arg ; }

    /**
     * Sets the year of the car
     * 
     * @param arg   for year of the car
     */
    public void setYear(int arg) { this.year = arg ; }

    /**
     * Sets the price of the car
     * 
     * @param arg   for price of the car
     */
    public void setPrice(double arg) { this.price = arg ; }

}