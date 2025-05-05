public class Employee {
    private int id;
    private String name;
    private Role role;
    private double baseSalary;
    private int daysWorked;

    public Employee(int id, String name, Role role, double baseSalary, int daysWorked){
        this.id = id;
        this.name = name;
        this.role = role;
        this.baseSalary = baseSalary;
        this.daysWorked = daysWorked;
    }

    public double getFinalSalary(){
        return baseSalary*daysWorked+ role.getBonus();
    }

    public Role getRole(){
        return role;
    }

    public int getDaysWorked(){
        return daysWorked;
    }

    @Override
    public String toString() {
        return String.format(
                "ID: %d | Name: %s | Role: %s | Days Worked: %d | Final Salary: $%.2f",
                id, name, role, daysWorked, getFinalSalary()
        );
    }
}
