/**
 * Represents an engine with fuel for a train.
 */

 public class Engine {

    // Attributes
    private FuelType f;
    double currentFuelLevel;
    double maxFuelLevel;

//Constructor
    /**
     * Constructs an engine with the specified fuel type, current fuel level, and maximum fuel level.
     *
     * @param f                The type of fuel for the engine.
     * @param currentFuelLevel The current level of fuel in the engine.
     * @param maxFuelLevel     The maximum capacity of fuel the engine can hold.
     */

    public Engine(FuelType f, double currentFuelLevel, double maxFuelLevel) {
        this.f = f;
        this.currentFuelLevel = currentFuelLevel;
        this.maxFuelLevel = maxFuelLevel;
    }

//Accessors
    /**
     * Gets the type of fuel used by the engine.
     *
     * @return The fuel type of the engine.
     */

    public FuelType getFuelType() {
        return f;
    }

    /**
     * Gets the current level of fuel in the engine.
     *
     * @return The current fuel level in the engine.
     */

    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    /**
     * Gets the maximum capacity of fuel the engine can hold.
     *
     * @return The maximum fuel level the engine can hold.
     */

    public double getMaxFuelLevel() {
        return maxFuelLevel;
    }

//Method to refuel
    /**
     * Refuels the engine, setting the current fuel level to the maximum capacity.
     */

    public void refuel() {
        currentFuelLevel = maxFuelLevel;
    }

//Method to check if theres enough fuel to go
    /**
     * Checks if there is enough fuel for the engine to operate.
     *
     * @throws NoFuelException If the engine is out of fuel.
     */

    public void go(){
        try {
            if (currentFuelLevel > 0) {
                System.out.println("Theres gas in the engine!");
            } else {
                throw new NoFuelException("We're all out of gas!");
            }
    /**
     * Custom exception class for indicating that the engine is out of fuel.
     */
        } catch (NoFuelException e) {
            System.err.println(e.getMessage());
        }
    }

    /**
     * Constructs a NoFuelException with the specified error message.
     *
     * @param message The error message.
     */

    private static class NoFuelException extends Exception {
        public NoFuelException(String message) {
            super(message);
        }
    }
}