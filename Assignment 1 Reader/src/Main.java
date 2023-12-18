import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Reader elzhan = new Reader("Elzhan", "230355", "SE", "87088343676", LocalDate.of(2006,07,16));
        elzhan.takeBook(7);
        elzhan.returnBooks(4);
    }
}