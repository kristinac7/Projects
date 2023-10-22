import java.util.ArrayList;

public class Customer {

    private String name;
    private String address;
    private int driversLicenseNum;
    private int phoneNumber;
    private final ArrayList<RentalAgreement> rentalAgreements = new ArrayList<>();

    public Customer(String name, String address, int driversLicenseNum, int phoneNumber) {
        this.name = name;
        this.address = address;
        this.driversLicenseNum = driversLicenseNum;
        this.phoneNumber = phoneNumber;
    }

    //-------------------------------------------------------------------------

    public ArrayList<RentalAgreement> getRentalAgreements() {
        return new ArrayList<>(rentalAgreements);
    }

    public void addRentalAgreement(RentalAgreement rentalAgreement) {
        if (!rentalAgreements.contains(rentalAgreement)) {
            rentalAgreements.add(rentalAgreement);
            rentalAgreement.setCustomer(this);
        }
    }

    public void removeRentalAgreement(RentalAgreement rentalAgreement) {
        if (rentalAgreements.contains(rentalAgreement)) {
            rentalAgreements.remove(rentalAgreements);
            rentalAgreement.setCustomer(null);
        }
    }

}
