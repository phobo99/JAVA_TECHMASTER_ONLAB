package Stream;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        IntStream.range(1,9).forEach(System.out::println);
        DoubleStream.of(1,2,3,9).forEach(System.out::println);
        LongStream.range(1,9).forEach(System.out::println);

        String [] stringArr = {"Java","C","C++","PHP"};
    }
}
