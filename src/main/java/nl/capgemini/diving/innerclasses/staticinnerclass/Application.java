package nl.capgemini.diving.innerclasses.staticinnerclass;

public class Application {
    public static void main(String[] args) {

//        ChargingPole.ChargingPoleBuilder builder = new ChargingPole.ChargingPoleBuilder("ChaDemo");

        ChargingPole pole = new ChargingPole.ChargingPoleBuilder("ChaDemo").location("Utrecht").numberOfChargers(3).build();




    }
}
