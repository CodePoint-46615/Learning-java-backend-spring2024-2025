import java.time.LocalDate;

public abstract class Employee {
    private int id; 
    private String name; 
    private LocalDate date_of_bith; 
    private String email; 
    private LocalDate join_date; 

    public Employee(int id, String name, LocalDate date_of_bith, String email, LocalDate join_date){
        this.id = id; 
        this.name = name; 
        this.date_of_bith = date_of_bith; 
        this.email = email; 
        this.join_date = join_date;
    }

    public int getID(){
        return id;
    }
    public void setID(int id){
        this.id=id; 
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name; 
    }

    public LocalDate getDOB(){
        return date_of_bith;
    }
    public void setDOB(LocalDate date_of_birth){
        this.date_of_bith = date_of_birth;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email; 
    }

    public LocalDate getJoinDate(){
        return join_date; 
    }
    public void setJoinDate(LocalDate join_date){
        this.join_date = join_date; 
    }

    public void printEmployeeDetails(){
        System.out.println("...Employee Details...");
        System.out.println("Employee ID: " +getID());
        System.out.println("Employee Name: " +getName());
        System.out.println("Employee Date of Birth: " +getDOB());
        System.out.println("Employee Email: " +getEmail());
        System.out.println("Employee Joining Date: " +getJoinDate());
    }
}
