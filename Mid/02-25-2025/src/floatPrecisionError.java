//Topic => floating point precision error

import java.math.BigDecimal;

public class floatPrecisionError {
    public static void main(String[] args) {

        double a = 0.1;
        double b = 0.2;
        System.out.println(a + b); //0.30000000000000004

//For overcoming this problem we use BigDecimal => Class

       BigDecimal ob1 = new BigDecimal("0.1");
       BigDecimal ob2 = new BigDecimal("0.2");
       System.out.println(ob1.add(ob2)); //0.3

//If we pass the parameter as a value not a string then again the precision error will arise
//Because If we pass the only value it will be considered as double type(64 bit => 8 byte)

        BigDecimal c = new BigDecimal(0.1);
        BigDecimal d = new BigDecimal(0.2);
        System.out.println(c.add(d));   //0.30000000000000004
    }
}