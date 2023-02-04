import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Lab8 {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(11,27,3,94,45,46,76,48,94);
        integerStream.map(input->input+10).forEach(System.out::println);

        List<String> names = Arrays.asList("Aiswarya","Chikoo","Amar","Royal Subham");
        names.stream()
                .map(String::length)
                .forEach(System.out::println);

        List<Employee> list1 = Employee.getList(10);
        list1.stream().map(e->e.getEmpName()).forEach(System.out::println);

    }
}
