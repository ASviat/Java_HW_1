import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число 1: ");
        int num1 = iScanner.nextInt();
        System.out.println("Введите действие: ");
        char my_char = iScanner.next().charAt(0);
        System.out.println("Введите число 2: ");
        int num2 = iScanner.nextInt();
        iScanner.close();

        System.out.println("Ваш результат: ");

        switch (my_char) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '%':
                System.out.println(num1 % num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
        }
    }
}
