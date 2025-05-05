import java.util.List;

public class CourseFilter {
    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        // a. Print All Courses individually
//        System.out.println("All Courses:");
//        courses.forEach(System.out::println);

        // b. Print Courses Containing the word "Spring"
//        System.out.println("Courses containing 'Spring':");
//        courses.stream()
//                .filter(course -> course.contains("Spring"))
//                .forEach(System.out::println);

        // c. Print Courses Whose Name has at least 4 letters
//        System.out.println("Courses with at least 4 letters:");
//        courses.stream()
//                .filter(course -> course.length() >= 4)
//                .forEach(System.out::println);

        // d. Sort the courses alphabetically
//        System.out.println("Courses sorted alphabetically:");
//        courses.stream()
//                .sorted()
//                .forEach(System.out::println);
    }
}
