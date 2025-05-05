import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(104, "SAIKOT KUNDU", Role.CHECKER, 800, 25),
                new Employee(100, "SONY", Role.PACKAGER, 500, 21),
                new Employee(99, "MRIDUL", Role.TAILOR, 400, 28),
                new Employee(105, "RAHIM", Role.CHECKER, 800, 24),
                new Employee(105, "KARIM", Role.PACKAGER, 500, 22),
                new Employee(105, "RAHUL", Role.TAILOR, 400, 19)
        );
        PayrollProcessor.processPayroll(employees);
    }
}