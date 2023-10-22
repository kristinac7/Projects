public class Car {

    private int regNum;
    private String brand;
    private String model;
    private boolean status;
    private Pricegroup pricegroup;

    public Car(int regNum, String brand, String model, boolean status, Pricegroup pricegroup) {
        this.regNum = regNum;
        this.brand = brand;
        this.model = model;
        this.status = status;
        this.pricegroup = pricegroup;
    }

    //-------------------------------------------------------------------------

    public int getRegNum() {
        return regNum;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public boolean isStatus() {
        return status;
    }

    public Pricegroup getPricegroup() {
        return pricegroup;
    }
}
