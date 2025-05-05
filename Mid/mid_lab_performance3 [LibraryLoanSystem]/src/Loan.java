import java.time.LocalDate;

public class Loan <T>{
    private String loanId;
    private String username;
    private LocalDate loanDate;
    private LocalDate returnDate;
    private T media;

    public Loan(String loanId, String username, LocalDate loanDate, LocalDate returnDate, T media) {
        this.loanId = loanId;
        this.username = username;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
        this.media = media;
    }

    public String getLoanId() {
        return loanId;
    }

    public String getUsername(){
        return username;
    }

    public LocalDate getLoanDate(){
        return loanDate;
    }

    public LocalDate getReturnDate(){
        return returnDate;
    }

    public T getMedia(){
        return media;
    }

    @Override
    public String toString(){
        return "LoadID:" + loanId + " Username:" + username + " LoanDate:" + loanDate + " ReturnDate:" + returnDate;
    }
}
