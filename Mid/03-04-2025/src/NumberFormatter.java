//Topic   => HomeWork_1_NumberFormatter
//Concept => Nested Class

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;
public class NumberFormatter {

    //static-nested class => take input method 
    static class InputHandler {
        static BigDecimal takeInput() {
            System.out.print("Enter your number:"); //showing a message 
            Scanner sc = new Scanner(System.in);      //taking input 
            BigDecimal num = sc.nextBigDecimal();    // Reads the input as BigDecimal 
            sc.close();                              //closes the Scanner after input is taken
            return num;                             // return the number
        }
    }

    //non-static-nested class => formatting method 
    class Formatter {
        String format(BigDecimal num) {
            DecimalFormat formatter = new DecimalFormat("##,##,###"); //DecimalFormat object with the Indian number system pattern
            return formatter.format(num);                                     //convert number into formated string 
        }
    }

    //main function => output
    public static void main(String[] args) {
        BigDecimal num = InputHandler.takeInput();
        System.out.print("Output: ");
        System.out.println(new NumberFormatter().new Formatter().format(num));
    }

    //key rule:
    //Without an outer class instance, static-nested class can be accessed.
    //Without an outer class instance, non-static class can not be accessed.
}
