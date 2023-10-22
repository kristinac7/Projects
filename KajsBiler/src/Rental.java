import java.time.LocalDate;

public class Rental {

    private LocalDate actualRentalPeriod;
    private double deposit;
    private int kmStart;
    private int kmSlut;
    private Car car;
    private RentalAgreement rentalAgreement;

    public Rental(LocalDate actualRentalPeriod, double deposit, int kmStart, int kmSlut, Car car) {
        this.actualRentalPeriod = actualRentalPeriod;
        this.deposit = deposit;
        this.kmStart = kmStart;
        this.kmSlut = kmSlut;
        this.car = car;
    }

    //-------------------------------------------------------------------------

    public LocalDate getActualRentalPeriod() {
        return actualRentalPeriod;
    }

    public double getDeposit() {
        return deposit;
    }

    public int getKmStart() {
        return kmStart;
    }

    public int getKmSlut() {
        return kmSlut;
    }

    public Car getCar() {
        return car;
    }

}
