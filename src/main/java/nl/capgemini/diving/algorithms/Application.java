package nl.capgemini.diving.algorithms;

public class Application {

    public static void main(String[] args) {

        System.out.println(Calculations.sumFromOneTo(10));
        System.out.println(Calculations.sumFromOneToSmart(10));

        System.out.println(Calculations.fac(3));
        System.out.println(Calculations.fac(5));

        System.out.println(Calculations.gcd(27, 18));

        System.out.println(Calculations.gcd(27, 13));

        System.out.println(Calculations.lcm(30, 100));

        System.out.println(Calculations.fibon(5));

        System.out.println(Calculations.fibon(10));
    }
}
