import java.util.Scanner;
public class T_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.print("Введите имя: ");
        String name = sc.next();

        // .nextLine()   --- Считывает строчку 
        // .next() --- считывает элемент
        // .nextInt() --- считывает Число

        //12 \n 
        // num = 12
        // .... sc.nextLine(); //
        System.out.printf("Привет, %s", name);
        sc.close();

    }
}        
