package nl.capgemini.diving.hanoi;

public class Hanoi {

    public void hanoi(int numberOfDices) {
        hanoi(numberOfDices, 1, 2, 3);
    }


    private void hanoi(int numberOfDices, int from, int using, int destination) {


        if (numberOfDices == 0) {
            return;
        } else {
            hanoi(numberOfDices - 1, from, destination, using);
            System.out.println("Move " + from + " to " + destination);
            hanoi(numberOfDices - 1, using, from, destination);
        }

    }
}
