class person {
    void show() {
        System.out.println("Person");
    }
}

class teacher extends person {
    void show() {
        System.out.println("Teacher");
    }
}

class student extends person {
    void show() {
        System.out.println("Student");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        person p;

        p = new teacher(); // p is a Person, but refers to a Teacher
        p.show();          // Output: Teacher

        p = new student(); // p is a Person, but refers to a Student
        p.show();          // Output: Student

        //student s;
        //s = new person(); // not possible give error
    }
}