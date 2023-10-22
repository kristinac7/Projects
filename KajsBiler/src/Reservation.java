import java.time.LocalDate;

public class Reservation {

    private LocalDate date;
    private LocalDate expectedRentalPeriod;
    private Pricegroup priceGroup;

    public Reservation(LocalDate date, LocalDate expectedRentalPeriod, Pricegroup priceGroup) {
        this.date = date;
        this.expectedRentalPeriod = expectedRentalPeriod;
        this.priceGroup = priceGroup;
    }

    //-------------------------------------------------------------------------

    public LocalDate getDate() {
        return date;
    }

    public LocalDate getExpectedRentalPeriod() {
        return expectedRentalPeriod;
    }

    public Pricegroup getPriceGroup() {
        return priceGroup;
    }

}
