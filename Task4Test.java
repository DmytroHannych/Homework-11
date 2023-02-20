package module11;


import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task4Test {
    public static void main(String[] args) {
        generatorNumber(25214903L, 11, (long)Math.pow(2,48));

    }

    public static Stream<Long> generatorNumber(Long a, int c, Long m) {
        Long seed1 = 5L;
        Stream<Long> stream = Stream.iterate(seed1, seed -> 1 * (a * seed + c) % m);
        stream
                .limit(10)
                .peek(System.out::println)
                .collect(Collectors.toList());

        return stream;
    }
}

