import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};
        int[][] c = {{0, 0}, {0, 0}};
        int[][] d = {{0, 0}, {0, 0}};

        Matrix massiv1 = new Matrix(a, b);
        massiv1.soutarray(a, b);
        massiv1.multiplearray(a, b, c);
        massiv1.addarray(a, b, d);

    }
}