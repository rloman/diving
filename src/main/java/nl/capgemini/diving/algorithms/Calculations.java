package nl.capgemini.diving.algorithms;

import nl.capgemini.diving.assertions.Assertion;

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

        Assertion.require(n > 0);

        int result = (n * (n + 1)) / 2;

        Assertion.ensure(result >= n);

        assert (result >= n);

        return result;
    }

    public static int fac(int n) {
        Assertion.require(n > -1);
        if (n == 0) {
            Assertion.ensure(n == 0);
            return 1;
        } else {
            Assertion.ensure(n > n -1);
            return n * fac(n - 1);
        }

    }

    //
    // gcd
    public static int gcd(int n, int m) {
        // simplest version
        if (n % m == 0) {
            return m;
        } else {
            return gcd(m, n % m);
        }
    }

    // kgv (Dutch), Englist least common multiple
    public static int lcm(int n, int m) {
        return (n * m) / gcd(n, m);
    }


    // fibonacci
    public static int fibon(int n) {

        if (n == 0) {
            return 0;
        } else {
            if (n == 1) {
                return 1;
            } else {
                return fibon(n - 1) + fibon(n - 2);
            }
        }
    }
}
