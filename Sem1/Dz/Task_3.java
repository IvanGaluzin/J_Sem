package Dz;

import java.util.Scanner;

// Реализовать простой калькулятор (+-/*)

public class Task_3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        double num1 = scanner.nextDouble();

        System.out.println("Введите второе число:");
        double num2 = scanner.nextDouble();

        System.out.println("Выберите действие(оператор) (+, -, *, /):");
        char operator = scanner.next().charAt(0);

        double result = 0;

        switch(operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Не верный оператор");
                return;
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}