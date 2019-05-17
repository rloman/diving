package nl.capgemini.diving.assertions;

public final class Assertion {

    public static void require(boolean b) {
        if(!b) {
            throw new AssertionError();
        }
    }

    public static void ensure(boolean b) {
        if(!b) {
            throw new AssertionError();
        }
    }
}
