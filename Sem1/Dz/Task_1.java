package Dz;

import java.util.Scanner;

public class Task_1 {

    // Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

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