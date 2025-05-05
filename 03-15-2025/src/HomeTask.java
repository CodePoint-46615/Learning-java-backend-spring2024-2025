import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface HomeTask {
    //Only methods allowed in annotation
    String msg();
    int value() default 0;

    //Nested annotation is allowed
    @interface InnerAnno {
        String data();
    }

    //Regular variable (NOT allowed)
    int x = 5; // Error: Annotation members must be methods, not variables

    //Default method (NOT allowed)
    /*
    default void show() {
        System.out.println("Default method");
    }
    */

    //Private method (NOT allowed)
    /*
    private int hidden() {
        return 10;
    }
    */

    //Static method (NOT allowed)
    /*
    static void display() {
        System.out.println("Static method");
    }
    */
}
