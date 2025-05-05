import java.lang.reflect.Method;
import java.math.BigDecimal;

public class SendAlert1 {
    public static void main(String[] args){
        Transaction transaction = new Transaction();
        transaction.send("Rahul", BigDecimal.valueOf(500));

        /*for (Method m : Transaction.class.getMethods()) {
            System.out.println("Available method: " + m.getName());
        }*/

        /*Method method = Transaction.class.getMethod("send", String.class, BigDecimal.class);

        if (method.isAnnotationPresent(SendAlert.class)) {
            SendAlert alert = method.getAnnotation(SendAlert.class);
            System.out.println("Send Alert to: " + alert.value());  // it will print email address
        }*/

    }
}