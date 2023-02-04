import java.util.List;
import java.util.Scanner;

public class Lab6 {
    public static void main(String[] args) {
        List<Employee> employeeList = Employee.getList(50);

        //Simple Pagination Of Records
        employeeList.stream()
                .skip(0)
                .limit(25)
                .forEach(System.out::println);

        //Input From User
        Scanner scanner = new Scanner(System.in);
        int skip = 0;
        int limit = 10;
        String s ="";
        while(true) {
            employeeList.stream()
                    .skip(skip)
                    .limit(limit)
                    .forEach(System.out::println);
            System.out.println("Enter P(prev) / N(next) / E(exit)");
            s = scanner.next();
            if (s.equalsIgnoreCase("p"))
                skip -= limit;
            else if (s.equalsIgnoreCase("n"))
                skip += limit;
            else if (s.equalsIgnoreCase("e"))
                break;
        }

    }
}
