package nl.capgemini.diving.algorithms;

public class Calculations {


    // sum it
    public static int sum(int... numbers) {
        int result = 0;
        for (int element : numbers) {
            result += element;
        }

        return result;
    }

    // sum all numbers from 1..n  (upto and INCLUDING n)
    public static int sumFromOneTo(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }

    public static int sumFromOneToSmart(int n) {
        int result = (n * (n + 1)) / 2;

        return result;
    }

    public static int fac(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fac(n - 1);
        }
    }

    //
}
