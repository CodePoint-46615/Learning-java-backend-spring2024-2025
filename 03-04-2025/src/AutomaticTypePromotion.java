//Topic => Automatic Type Promotion

public class AutomaticTypePromotion {
    public static void main(String[] args) {
        byte a = 40;
        byte b = 50;
        byte c = 100;
        //expression evaluation
        int result = a * b / c;
        // Java infers type from expression
        System.out.println("Result: " + result);  // Output: 20
        System.out.println("Type of the result: "+((Object)result).getClass().getSimpleName());

        byte by = 10;
        int i = 20;
        float f = 30.5f;
        double d = 40.75;
        //expression evaluation
        var sum = by / i + f * d;
        // Java infers type from expression
        System.out.println("Sum = " + sum);
        System.out.println("Type of the result: " + ((Object)sum).getClass().getSimpleName());

    }
}

// precedence order: double >> float >> long >> int
