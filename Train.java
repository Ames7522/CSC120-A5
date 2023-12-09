import java.util.ArrayList;

/**
 * Represents a train with an engine and multiple cars for passengers.
 */

public class Train {

    // Attributes
    private final Engine engine;
    private ArrayList<Car> cars;

    /**
     * Constructs a train with the specified fuel type, engine fuel capacity, number of cars, and passenger capacity per car.
     *
     * @param fuelType          The type of fuel for the train's engine.
     * @param engineFuelCapacity The fuel capacity of the train's engine.
     * @param nCars             The number of cars in the train.
     * @param passengerCapacity The maximum number of passengers each car can accommodate.
     */

    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity) {
        this.engine = new Engine(fuelType, fuelCapacity, fuelCapacity);

        //cars
        this.cars = new ArrayList<>();
        for (int i = 0; i < nCars; i++) {
            this.cars.add(new Car( (i + 1), passengerCapacity));
        }
    }

    /**
     * Gets the engine of the train.
     *
     * @return The engine of the train.
     */
    public Engine getEngine() {
        return engine;
    }

    /**
     * Gets the car at the specified index in the train.
     *
     * @param i The index of the car.
     * @return The car at the specified index.
     * @throws RuntimeException If the index is invalid.
     */

    public Car getCar(int i) {
        if (i >= 0 && i < cars.size()) {
            return cars.get(i);
        } else {
            throw new RuntimeException("Invalid car index!");
        }
    }

    /**
     * Calculates the maximum passenger capacity of the entire train.
     *
     * @return The total maximum number of passengers the train can accommodate.
     */

    public int getMaxCapacity() {
        int maxCapacity = 0;
        for (Car car : cars) {
            maxCapacity += car.getCapacity();
        }
        return maxCapacity;
    }

    /**
     * Calculates the remaining available seats in the entire train.
     *
     * @return The total number of seats remaining in the entire train.
     */

    public int seatsRemaining() {
        int remainingSeats = 0;
        for (Car car : cars) {
            remainingSeats += car.seatsRemaining();
        }
        return remainingSeats;
    }

    /**
     * Prints the manifest of the entire train, including the engine and each car.
     */
    
    public void printManifest() {
        System.out.println("Train Manifest: ");
        System.out.println("Engine: " + engine);
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("Car " + (i +1) + ": " + cars.get(i));
        }
    }
}
