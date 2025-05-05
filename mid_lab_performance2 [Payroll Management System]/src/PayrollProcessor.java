import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PayrollProcessor {
    public static Map<Role, List<Employee>> processPayroll(List<Employee> Employees){

        List<Employee> employees = Employees.stream()
                .filter(e -> e.getDaysWorked() >=20)
                .sorted(Comparator.comparingDouble(Employee::getFinalSalary).reversed())
                .collect(Collectors.toList());

        System.out.println("Employees who worked 20+ days: ");
        System.out.println("------------------------------");
        employees.forEach(System.out::println);
        System.out.println("------------------------------");

        System.out.println("Group By Role: ");
        Map<Role, List<Employee>> groupedByRole = Employees.stream()
                .collect(Collectors.groupingBy(Employee::getRole));

        groupedByRole.forEach((role, list)->{
            System.out.println(role + ":");
            list.forEach(System.out::println);
        });


        double totalPayroll = Employees.stream()
                .mapToDouble(Employee::getFinalSalary)
                .sum();

        System.out.printf("\nTotal Payroll Cost (20+ days only): $%.2f\n", totalPayroll);
        return groupedByRole;
    }
}