package module11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task5 {
    public static void main(String[] args) {
            Stream<String> first =  Stream.of("Vlad","Alex","Petro","Pavel");
        Stream<String> second = Stream.of("Vala","Anna","Maryna");
        Stream<String> zip = zip(first,second);
        System.out.println(zip.collect(Collectors.toList()));
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
       List<T> res = new ArrayList<>();
        Iterator<T> iterator1 = first.iterator();
        Iterator<T> iterator2 = second.iterator();
        while (iterator2.hasNext() && iterator1.hasNext()){
            res.add(iterator1.next());
            res.add(iterator2.next());

        }
        return  res.stream();
    }
}
