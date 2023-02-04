import java.util.List;

public class Lab4 {
    public static void main(String[] args) {
        List<Employee> employeeList = Employee.getList(100);

        System.out.println("*******************************Printing The Employees*****************************");
        System.out.println();

        //Printing The Employees
        employeeList.forEach(System.out::println);

        System.out.println();
        System.out.println("*******************************1. Filter where name is Aiswarya*****************************");
        System.out.println();

        //1. Filter where name is Aiswarya
        employeeList.stream()
                .filter(s->s.getEmpName().equals("Aiswarya"))
                .forEach(System.out::println);

        System.out.println();
        System.out.println("****************************2. Filter where name contains \"shree\"********************************");
        System.out.println();

        //2. Filter where name contains "shree"
        employeeList.stream()
                .filter(s->s.getEmpName().contains("shree"))
                .forEach(System.out::println);

        System.out.println();
        System.out.println("***********************3. Filter where bane starts with S and Salary > 300*************************************");
        System.out.println();

        //3. Filter where bane starts with S and Salary > 300
        employeeList.stream()
                .filter(s->s.getEmpName().startsWith("S") && s.getSalary()>300.00)
                .forEach(System.out::println);

        System.out.println();
        System.out.println("*************************4. Filter where dept is hr and project is morgan***********************************");
        System.out.println();

        //4. Filter where dept is hr and project is morgan
        employeeList.stream()
                .filter(s->s.getDept().equals("HR") && s.getProject().equals("Morgan"))
                .forEach(System.out::println);

        System.out.println();
        System.out.println("***************************5. Filter where dept s hr or project is Swiss*********************************");
        System.out.println();

        //5. Filter where dept s hr or project is Swiss
        employeeList.stream()
                .filter(s->s.getDept().equals("HR") || s.getProject().equals("Swiss"))
                .forEach(System.out::println);

        System.out.println();
        System.out.println("************************6. Filter where salary between 400 and 800************************************");
        System.out.println();

        //6. Filter where salary between 400 and 800
        employeeList.stream()
                .filter(s->s.getSalary()>400.00 && s.getSalary()<800.00)
                .forEach(System.out::println);
    }
}
