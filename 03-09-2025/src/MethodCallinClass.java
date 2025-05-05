/*Topic: private, static and default method calling in Interface

Q1. Can a private method be called from a static method in JAVA?
A private method can be called from any method within the same class, whether that method is static or not.

Q2. Can a private method be called from a default method in JAVA?
Just like with static methods, a default (package-private) method can also call a private method as long as
they are in the same class.*/

public class MethodCallinClass {
    private void privateHelper() {
        System.out.println("Private method");
    }

    void defaultMethod() {
        privateHelper();    //q2 call from default => possible
    }

    public static void main(String[] args) {
        new MethodCallinClass().privateHelper(); //q1 call from static => possible
    }
}

/*
N/B: If a nonstatic method is calling from a static method, need instance
*/