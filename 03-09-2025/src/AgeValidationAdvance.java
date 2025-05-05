import java.time.LocalDate;
import java.time.Period;

interface Validator{
    boolean isValid(Person person);

    static String getDateFormat() {
        return "dd-MM-yyyy";
    }

    default void print(Person p) {
        if (!test(p)) {
            System.out.println("Please fix the errors.");
        }
    }

    private boolean test(Person p) {
        return p.getId() != 0 && !p.getName().isEmpty();
    }
}

abstract class Person implements Validator {
    int id;
    String name;
    LocalDate dateOfBirth;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}

class Student extends Person {

    @Override
    public boolean isValid(Person person) {
        return Period.between(LocalDate.now(), person.getDateOfBirth()).getYears() >= 18;
    }
}

class   Teacher extends Person {

    @Override
    public boolean isValid(Person person) {
        return Period.between(LocalDate.now(), person.getDateOfBirth()).getYears() >= 22;
    }
}

public class AgeValidationAdvance {
    public static void main(String[] args) {
        Person p = new Student();
        Student student = new Student();
        student.setId(101);
        student.setName("John Doe");
        student.setDateOfBirth(LocalDate.of(2000, 4, 10));  // Change this to test different ages

        boolean valid = student.isValid(student);
        System.out.println("Is student valid? " + valid);

        student.print(student);  // Will show "Please fix the errors." if ID is 0 or name is empty
    }
}
