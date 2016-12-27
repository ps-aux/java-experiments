package pro.absolutne.lambda;

import java.util.stream.Stream;

public class A extends SuperA {

    private final int n;

    public A(int n) {
        this.n = n;
    }

    /**
     * Maps any integer to the n.
     */
    public int toN(int y) {
        return n;
    }

    public int doubleN() {
        return 2 * n;
    }

    public boolean isSame(int x) {
        return n == x;
    }

    public Stream<Integer> filterSame(Stream<Integer> input) {
        return input.filter(this::isSame)
                .filter(super::yes);
    }

    @Override
    public String toString() {
        return "A{" +
                "n=" + n +
                "} ";
    }
}
