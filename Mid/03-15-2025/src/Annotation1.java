//Basic example of Annotation

@interface MyAnno {
    String msg();
    int value();
}

class Calculator{
    @MyAnno(msg = "Addition", value =10)  // Provide both msg and value
     void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }
}

public class Annotation1 {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.add(10, 10);
    }
}
