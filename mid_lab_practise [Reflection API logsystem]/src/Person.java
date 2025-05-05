public class Person {

    @Log
    void test(int num1, int num2) {
        if (num1 == num2) {
            System.out.println("equals");
        }
        else {
            System.out.println("not equals");
        }
    }

    @Log
    void info() {
        System.out.println("Info");
    }
}
