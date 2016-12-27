package pro.absolutne.lambda;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    static boolean isEven(int x) {
        return x % 2 == 0;
    }


    /**
     * object::instanceMethod & Class:staticMethod example
     */
    static void example1() {
        IntStream.range(0, 10)
                .filter(Main::isEven)
                .map(new A(4)::toN)
                .forEach(System.out::println);
    }

    /**
     * Class::instanceMethod example
     */
    static void example2() {

        Stream<?> s =
                Stream.of(new A(5), new A(6), new A(7))
                        .map(A::doubleN);

        printStream(s);
    }

    /**
     * this/super method reference
     */
    static void example3() {
        Stream<Integer> stream = IntStream.of(4, 3, 2, 5, 5).boxed();

        Stream<?> s = new A(5).filterSame(stream);

        printStream(s);
    }

    /**
     * Constructor reference
     */
    static void example4() {
        Stream<?> s = IntStream.of(5, 6, 7)
                .mapToObj(A::new);

        printStream(s);
    }

    static void printStream(Stream<?> stream) {
        stream.forEach(System.out::println);
    }

    public static void main(String[] args) {
        example4();
    }

}
