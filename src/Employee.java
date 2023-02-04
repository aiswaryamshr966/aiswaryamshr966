import java.util.ArrayList;
import java.util.List;

public class Employee {
    private int empNo;
    private String empName;
    private double salary;
    private String dept;
    private String project;

    public Employee(int empNo, String empName, double salary, String dept, String project) {
        this.empNo = empNo;
        this.empName = empName;
        this.salary = salary;
        this.dept = dept;
        this.project = project;
    }

    public Employee() {
    }

    public int getEmpNo() {
        return empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public double getSalary() {
        return salary;
    }

    public String getDept() {
        return dept;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNo=" + empNo +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                ", dept='" + dept + '\'' +
                ", project='" + project + '\'' +
                '}';
    }

    public static List<Employee> getList(int index){
        List<Employee> list = new ArrayList<>();
        String[] names = {"Aiswarya","Chikoo","Subham","Amar","Chintu","Angan","Sushree","Tarun","Swapna","Sagarika"};
        String[] projects = {"Morgan","Citi","JPMC","HSBC","RBS","Swiss"};
        String[] depts = {"HR","IT","FIN"};

        for(int i=0;i<=index;i++){
            Employee employee = new Employee();
            employee.setEmpNo(i);
            employee.setEmpName(names[i%names.length]);
            employee.setDept(depts[i%depts.length]);
            employee.setProject(projects[i%projects.length]);
            employee.setSalary(Math.random()*1000);
            list.add(employee);
        }
        return list;
    }
}
