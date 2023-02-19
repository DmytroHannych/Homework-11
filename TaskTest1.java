package module11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskTest1 {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        List<String> names = new ArrayList(Arrays.asList("Petrov", "Andriy","Anna","Maryna","Victor"));
        task1.findOddName(names);
    }
}


