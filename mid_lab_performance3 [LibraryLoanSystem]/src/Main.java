import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LibraryLoanSystem system = new LibraryLoanSystem();

        system.addLoan(new Loan<>( "L001", "SAIKOT", LocalDate.of(2025, 3, 1), LocalDate.of(2025, 3, 15), new Book("Java Basics", "Author A")));
        system.addLoan(new Loan<>( "L002", "SONY", LocalDate.of(2025, 3, 5), LocalDate.of(2025, 3, 20), new Audiobook("Learn Java Fast", 300)));
        system.addLoan(new Loan<>( "L003", "MRIDUL", LocalDate.of(2025, 4, 10), LocalDate.of(2025, 4, 25), new Ebook("Mastering Java", 5.2)));

        System.out.println("\t-----Details by Specific Month------");
        System.out.println("Total loans in March 2025: " + system.totalLoansInMonth(2025, 3));

        System.out.println("\n\t-----Details by Specific User------");
        system.loansByUser("SAIKOT").forEach(System.out::println);
        system.loansByUser("SONY").forEach(System.out::println);

        System.out.println("\nAverage loan duration: " + system.averageLoanDuration() + " days");
    }
}


