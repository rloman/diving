package nl.capgemini.diving.innerclass;

public class Car {

    private int mileage;
    private String licensePlate;

    private Engine engine;

    public Car() {
        this.engine = new Engine();
        this.engine.cc = 1500;
    }

    public void drive() {
        engine.drive();
    }

    private class Engine {

        private int cc;
        private boolean on;

        private Engine() {

        }

        public void start() {
            this.on = true;
        }

        public void drive() {
            mileage++;
        }


    }


}
