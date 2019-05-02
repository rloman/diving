package nl.capgemini.diving.staticinnerclass;

public class ChargingPole {

    // 20 properties,modelling 5 here for demo purposes
    private String type;
    private int numberOfChargers;
    private String location;
    private String owner;
    private double rentalPrice;

    private ChargingPole(ChargingPoleBuilder builder) {
        this.type = builder.type;
        this.numberOfChargers = builder.numberOfChargers;
        this.owner = builder.owner;
    }

    public String getType() {
        return type;
    }

    public int getNumberOfChargers() {
        return numberOfChargers;
    }

    public String getLocation() {
        return location;
    }

    public String getOwner() {
        return owner;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public static class ChargingPoleBuilder {

        private String type;
        private int numberOfChargers;
        private String location;
        private String owner;
        private double rentalPrice;


        public ChargingPoleBuilder(String type) {
            this.type = type;
        }

        public ChargingPoleBuilder numberOfChargers(int numberOfChargers) {
            this.numberOfChargers = numberOfChargers;

            return this;

        }

        public ChargingPoleBuilder location(String location) {
            this.location = location;

            return this;
        }

        public ChargingPoleBuilder owner(String owner) {
            this.owner = owner;

            return this;
        }

        public ChargingPole build() {
            return new ChargingPole(this);
        }
    }
}
