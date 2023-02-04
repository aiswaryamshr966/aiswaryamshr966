import java.util.stream.Stream;

public class Lab1 {
    public static void main(String[] args) {
        Stream<Integer> intstream1 = Stream.of(10);
        intstream1.forEach(System.out::println);
        System.out.println("==========");
        Stream<Integer> intstream2 = Stream.of(5, 10, 16, 11, 1, 99, 66, 322);
        intstream2.forEach(System.out::println);
    }
}