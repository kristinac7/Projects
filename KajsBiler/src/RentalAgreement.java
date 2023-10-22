import java.time.LocalDate;

public class RentalAgreement {

    private int contractNum;
    private LocalDate contDate;
    private Customer customer;
    private Reservation reservation;
    private Rental rental;

    public RentalAgreement(int contractNum, LocalDate contDate, Reservation reservation) {
        this.contractNum = contractNum;
        this.contDate = contDate;
        this.reservation = reservation;
    }

    //-------------------------------------------------------------------------

    public int getContractNum() {
        return contractNum;
    }

    public LocalDate getContDate() {
        return contDate;
    }

    public Reservation getReservation() {
        return reservation;
    }
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        if (this.customer != customer) {
            Customer oldCustomer = this.customer;
            if (oldCustomer != null) {
                oldCustomer.removeRentalAgreement(this);
            }
            this.customer = customer;
            if (customer != null) {
                customer.addRentalAgreement(this);
            }
        }
    }

    public void setReservation(Reservation reservation) {
        if (this.reservation != reservation) {
            this.reservation = reservation;
        }
    }

    public void setRental(Rental rental) {
        if (this.rental != rental) {
            this.rental = rental;
        }
    }
}
