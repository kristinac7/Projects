import java.util.ArrayList;

public class Pricegroup {

    private char group;
    private double pricePerDay;
    private double pricePerHour;
    private double pricePerKm;
    private final ArrayList<Car> cars = new ArrayList<>();

    public Pricegroup(char group, double pricePerDay, double pricePerHour, double pricePerKm) {
        this.group = group;
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.pricePerKm = pricePerKm;
    }

    //-------------------------------------------------------------------------

    public char getGroup() {
        return group;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public double getPricePerKm() {
        return pricePerKm;
    }

    public ArrayList<Car> getCars() {
        return new ArrayList<>();
    }
    public Car createCar(int regNum, String brand, String model, boolean status) {
        Car car = new Car(regNum, brand, model, status, this);
        cars.add(car);
        return car;
    }

    public void addCar(Car car) {
        if (!cars.contains(car)) {
            cars.add(car);
        }
    }

    public void removeCar(Car car) {
        if (cars.contains(car)) {
            cars.remove(cars);
        }
    }
}
