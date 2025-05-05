import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.time.Instant;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        Method[] methods = p.getClass().getDeclaredMethods();
        Object[] arguments = {10, 20};
        for(Method method: methods) {
            if (method.isAnnotationPresent(Log.class)) {
                System.out.println(method.getName());
                System.out.println(Instant.now());

                try {
                    method.invoke(p, arguments);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
