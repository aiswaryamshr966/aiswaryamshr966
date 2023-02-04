import java.util.List;
import java.util.Optional;

//Program to display the operations of short-circuiting terminal operations
//findFirst()/findAny()/anyMatch()/allMatch()
public class Lab5 {
    public static void main(String[] args) {
        List<Employee> employeeList = Employee.getList(50);
        employeeList.forEach(System.out::println);
        System.out.println();
        System.out.println();

        Optional<Employee> aiswaryaDetails = employeeList.stream()
                                                    .filter(s->s.getEmpName().equals("Aiswarya"))
                                                    .findFirst();
        System.out.println(aiswaryaDetails.get());

        Optional<Employee> chikooDetails = employeeList.stream()
                                                        .filter(s->s.getEmpName().equals("Chikoo"))
                                                        .findAny();
        System.out.println(chikooDetails.get());

        boolean allTruth = employeeList.stream().allMatch(s->s.getEmpName().startsWith("A"));
        System.out.println("All Matching Reference: "+allTruth);

        boolean anyTruth = employeeList.stream().anyMatch(s->s.getEmpName().startsWith("C"));
        System.out.println("Any Matching Reference: "+anyTruth);
    }
}
