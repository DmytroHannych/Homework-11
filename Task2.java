package module11;

import java.util.*;
import java.util.stream.Stream;

public class Task2 {
    List<String> names = new ArrayList(Arrays.asList("Petrov", "Andriy","Anna","Maryna","Victor"));
    public void namesToUpperCase(){
        names
                .stream()
                .map(String :: toUpperCase)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
