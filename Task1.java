package module11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task1 {
    public void findOddName(List<String> names){
        List<String> nameStream = IntStream
                .range(0, names.size())
                .filter(i -> i % 2 !=0)
                .mapToObj(i -> names.get(i))
                .collect(Collectors.toList());
        System.out.println(nameStream);
    }
}
