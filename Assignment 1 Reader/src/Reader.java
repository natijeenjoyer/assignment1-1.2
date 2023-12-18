import java.time.LocalDate;

public class Reader {
    public String fullName, cardnumber, faculty, phoneNumber;
    public LocalDate dateOfBirth;

    public Reader(String fullName,
                         String cardnumber,
                         String faculty,
                         String phoneNumber,
                         LocalDate dateOfBirth) {
        this.fullName = fullName;
        this.cardnumber = cardnumber;
        this.faculty = faculty;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
    }
    public void takeBook(int numberOfBooks) {
        System.out.println(fullName + " took " + numberOfBooks + " books.");
    }

    public void returnBooks(int numberOfBooks) {
        System.out.println(fullName + " returned " + numberOfBooks + " books.");
    }
}
