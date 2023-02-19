package module11;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task3 {
    List<String> number = Arrays.asList("1, 2, 0", "4, 5");

    public void  numberStream () {
        List<Integer> num =
                number.stream()
                .map((str) -> List.of(str.split(", ")))
                        .flatMap(Collection::stream)
                        .map(n -> Integer.parseInt(n))
                                .sorted()
                                .collect(Collectors.toList());
        System.out.println(num);
    }
}
