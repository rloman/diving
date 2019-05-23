package nl.capgemini.diving.hanoi;

public class Hanoi {

    public void hanoi(int aantal) {
        hanoi(aantal, 1, 2, 3);
    }


    private void hanoi(int aantal, int van, int via, int naar) {


        if (aantal == 0) {
            return;
        } else {
            hanoi(aantal - 1, van, naar, via);
            System.out.println("Move " + van + " naar " + naar);
            hanoi(aantal - 1, via, van, naar);
        }

    }
}
