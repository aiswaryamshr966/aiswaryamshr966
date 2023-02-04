import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Lab7 {
    public static void main(String[] args) {
        Stream<Integer> intstream1 = Stream.of(10);
        intstream1.forEach(System.out::println);
        System.out.println("==========");
        Stream<Integer> intstream2 = Stream.of(5, 10, 16, 11, 1, 99, 66, 322);
        intstream2.sorted().forEach(System.out::println);
        System.out.println("==========");

        List<Employee> list = Employee.getList(10);
        System.out.println("-----------------Salary Based Sorting-----------------");
        list.stream().sorted( (e1,e2)->Double.compare(e1.getSalary(),e2.getSalary())).forEach(System.out::println);
        System.out.println();
        list.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).forEach(System.out::println);

        System.out.println();

        System.out.println("-----------------Name Based Sorting-----------------");
        list.stream().sorted( (e1,e2)->e1.getEmpName().compareTo(e2.getEmpName())).forEach(System.out::println);
        System.out.println();
        list.stream().sorted(Comparator.comparing(Employee::getEmpName)).forEach(System.out::println);


    }
}
