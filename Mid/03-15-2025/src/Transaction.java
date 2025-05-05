import java.math.BigDecimal;

class Transaction{
    public Transaction(){
        System.out.println("Initializing Transaction...");
    }

    @SendAlert
    public void send(String to, BigDecimal amount){
        System.out.println(amount + " Tk. send to " + to);
    }

    void receive(String from, BigDecimal amount){
        System.out.println(amount + " receive from " + from );
    }
}

