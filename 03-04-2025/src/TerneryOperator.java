//Topic => Ternary Operator

public class TerneryOperator {
    public static void main(String[] args) {
        int n = 110;
        //traditional if-else
        if(n%2 == 0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }

        //ternery operator
        int result = (n%2);
        // (result == 0) ? "Even": "Odd" //error => calculates the ternary result ("Even" or "Odd") but not storing it or printing it, so Java lets it compile (if warnings are off), but it’s a useless expression.
        System.out.println((result == 0) ? "Even": "Odd");

    }
}
