import java.util.ArrayList;
/**
 * Represents a car in a train with passengers on board.
 */
public class Car {

    //Attributes
    private ArrayList<Passenger> PassengersOnboard;
    private int maxCapacity;
    private int carNum;

//Constructor
/**
     * Constructs a car with the given car number and maximum capacity.
     *
     * @param carNum      The unique identifier for the car.
     * @param maxCapacity The maximum number of passengers the car can accommodate.
     */


    public Car(int carNum, int maxCapacity) {
        this.carNum = carNum;
        this.maxCapacity = maxCapacity;
        this.PassengersOnboard = new ArrayList<>();
    }

//Accessor-like methods
/**
     * Gets the maximum capacity of the car.
     *
     * @return The maximum number of passengers the car can accommodate.
     */

    public int getCapacity() {
        return maxCapacity;
    }

/**
     * Calculates the remaining available seats in the car.
     *
     * @return The number of seats remaining in the car.
     */

    public int seatsRemaining() {
        return maxCapacity - PassengersOnboard.size();
    }

//Methods
/**
     * Adds a passenger to the car if there are available seats.
     *
     * @param p The passenger to be added.
     * @throws RuntimeException If the passenger is already on the car or if the car is at max capacity.
     */

    public void addPassenger(Passenger p) {
        if (seatsRemaining() > 0) {
            if (this.PassengersOnboard.contains(p)) {
            throw new RuntimeException(p.getName() + " is already on Car " + this.carNum);
        }
        PassengersOnboard.add(p);
    } else {
        throw new RuntimeException("Car " + this.carNum + " is at max capacity.");
    }
    }

/**
     * Removes a passenger from the car.
     *
     * @param p The passenger to be removed.
     * @throws RuntimeException If the passenger is not on the car.
     */

    public void removePassenger(Passenger p) {
        if (!PassengersOnboard.contains(p)) {
            throw new RuntimeException(p.getName() + " is not on Car " + this.carNum);
        }
        PassengersOnboard.remove(p);
    }

//Prints the manifest of passengers on the car.
    public void printManifest() {
        System.out.println("Passengers on Car " + this.carNum + ": " + PassengersOnboard.toString());
    }
/**
     * Generates a string representation of the passengers on board.
     *
     * @return A string containing the names of passengers on the car.
     */

    public String toString() {
        String PassengersOnboardString = "";
        for (Passenger p : this.PassengersOnboard) {
            PassengersOnboardString += p.getName() + ", ";
        }
        return PassengersOnboardString;
    }
}