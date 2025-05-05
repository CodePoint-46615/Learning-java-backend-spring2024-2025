import java.time.LocalDate;

public class Staff extends Employee {
    private String category; 

    public Staff(int id, String name, LocalDate date_of_bith, String email, LocalDate join_date, String category){
        super(id, name, date_of_bith, email, join_date);
        this.category = category;
    }

    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category=category;
    }

    public void printEmployeeDetails(){
        System.out.println("...Employee Details...");
        System.out.println("Employee ID: " +getID());
        System.out.println("Employee Name: " +getName());
        System.out.println("Employee Date of Birth: " +getDOB());
        System.out.println("Employee Email: " +getEmail());
        System.out.println("Employee Joining Date: " +getJoinDate());
        System.out.println("Employee Category: " +getCategory());
    }
}
