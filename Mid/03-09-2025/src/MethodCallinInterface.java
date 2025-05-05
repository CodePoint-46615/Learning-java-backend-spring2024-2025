//Topic: private, static and default method calling in Interface

//Traditional Interface JAVA 7
//❌ Java 7: No default, no static with body, no private methods in interfaces.

/*interface MyInterface{
    void defaultMethod();
    void staticMethod();
}

class MyClass implements MyInterface {
    @Override
     public void defaultMethod() {
        System.out.println("Default Method");
    }

    @Override
    public void staticMethod() {
        System.out.println("Static Method");
    }
}*/

//Interface (Java 9) => Introduce default, static, private, private static with implementation
//In JAVA 8 => there were only default and static implementation
interface MyInterface {
    default void defaultMethod() {
        helperMethod();  // calls private method
    }

    static void staticMethod() {
        helperStatic();  // calls private static method
    }

    private void helperMethod() {
        System.out.println("Private instance method");
    }

    private static void helperStatic() {
        System.out.println("Private static method");
    }
}
class MyClass implements MyInterface {
    // No need to override defaultMethod unless want a custom behavior
}


public class MethodCallinInterface {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.defaultMethod();        // calls default method
        //obj.staticMethod();         // calls static method (JAVA 7)
        MyInterface.staticMethod(); // calls static method (JAVA 9+)
    }
}
