import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите количество необходимых циклов: ");
        int x = iScanner.nextInt();
        iScanner.close();

        String megaSum = SumIt(x, 1);
        System.out.println(megaSum);
    }

    public static String SumIt(int number, int i) {
        int my_sum = 0;
        if (i == number + 1)
            return "";
        else {
            my_sum = (i * (i + 1)) / 2;
            i++;
            System.out.printf("%d ", my_sum);
            return SumIt(number, i);
        }
    }
}