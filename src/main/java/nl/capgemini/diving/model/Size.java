package nl.capgemini.diving.model;

public enum Size {

    SM(15.00), MEDIUM(20.00), LARGE(20.00), XLARGE(25.00);

    private double price;

    private Size(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
