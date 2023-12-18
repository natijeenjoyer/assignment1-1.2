import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Phone iphone = new Phone(1, "14 Pro", 150);
        Phone samsung = new Phone(2, "Galaxy Fold Z", 170);
        Phone poco = new Phone(3, "X3 Pro", 200);

        Phone.receiveCall("Elzhan", "87088343676");
    }
}