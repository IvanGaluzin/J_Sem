// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();

        int triangularNumber = 0;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            triangularNumber += i;
            factorial *= i;
        }

        System.out.println("Треугольное число для n = " + n + ": " + triangularNumber);
        System.out.println("Факториал для n = " + n + ": " + factorial);
    }
}