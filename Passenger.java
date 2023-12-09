/**
 * Represents a passenger with a name and the ability to board and get off a car.
 */
public class Passenger {

    //Attributes
    private String name;
    private Car car;

    /**
     * Constructs a passenger with the specified name.
     *
     * @param name The name of the passenger.
     */

    public Passenger(String name) {
        this.name = name;
    }

    /**
     * Gets the name of the passenger.
     *
     * @return The name of the passenger.
     */

    public String getName() {
        return name;
    }

    /**
     * Boards the specified car, adding the passenger to the car's list of passengers.
     *
     * @param c The car to board.
     */

    public void boardCar(Car c) {
        c.addPassenger(this);
        this.car = c;
    }

    /**
     * Gets off the specified car, removing the passenger from the car's list of passengers.
     *
     * @param c The car to get off.
     */

    public void getOffCar(Car c) {
        c.removePassenger(this);
        this.car = null;

    }

//Gets the current car of the passenger
    /**
     * Gets the current car of the passenger.
     *
     * @return The car that the passenger is currently on, or null if not on any car.
     */

    public Car getCurrentCar() {
        return car;
    }
}