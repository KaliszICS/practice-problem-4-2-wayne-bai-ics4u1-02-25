public class Dog {
    
    private String name;
    private String breed;
    private int weight;

    /**
     * Creates a new dog object with a name, breed, and weight.
     * 
     * @param name of the dog
     * @param breed of the dog
     * @param weight of the dog
     */

    public Dog(String name, String breed, int weight) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

    /**
     * Gets the name of the dog
     * 
     * @return the name of the dog
     */
    public String getName() { return this.name; }

    /**
     * Gets the breed of the dog
     * 
     * @return the breed of the dog
     */
    public String getBreed() { return this.breed; }
    
    /**
     * Gets the weight of the dog
     * 
     * @return the weight of the dog
     */
    public int getWeight() { return this.weight; }

    /**
     * Sets the name of the dog
     * 
     * @param arg the name for the dog
     */
    public void setName(String arg) { this.name = arg; }

    /**
     * Sets the breed of the dog
     * 
     * @param arg the breed of the dog
     */
    public void setBreed(String arg) { this.breed = arg; }

    /**
     * Sets the weight of the dog
     * 
     * @param arg the weight of the dog
     */
    public void setWeight(int arg) { this.weight = arg; }
}