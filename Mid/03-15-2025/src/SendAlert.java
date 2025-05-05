import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface SendAlert {
    String value() default "saikotkundu34708@gmail.com";
}
