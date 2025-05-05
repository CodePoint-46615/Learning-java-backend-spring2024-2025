import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LibraryLoanSystem {
    private List<Loan<?>> loans = new ArrayList<>();

    public void addLoan(Loan<?> loan) {
        loans.add(loan);
    }

    // Report 1: Total Loans in Specific Month
    public long totalLoansInMonth(int year, int month) {
        return loans.stream()
                .filter(loan -> loan.getLoanDate().getYear() == year && loan.getLoanDate().getMonthValue() == month)
                .count();
    }

    // Report 2: List of Loans by Specific User
    public List<Loan<?>> loansByUser(String username) {
        return loans.stream()
                .filter(loan -> loan.getUsername().equalsIgnoreCase(username))
                .collect(Collectors.toList());
    }

    // Report 3: Average Loan Duration
    public double averageLoanDuration() {
        return loans.stream()
                .mapToLong(loan -> loan.getReturnDate().toEpochDay() - loan.getLoanDate().toEpochDay())
                .average()
                .orElse(0.0);
    }
}