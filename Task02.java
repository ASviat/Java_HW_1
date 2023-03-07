//Вывести все простые числа от 1 до 1000

public class Task02 {

    public static void main(String[] args) {
        int count = 0;
        System.out.println("Натуральные число от 1 до 1000:");
        for (int i = 1; i < 1001; i++) {

            if (count == 2) {
                System.out.printf(i-1 + " ");
            }
            count = 0;

            for (int j = 1; j < 1001; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
        }
    }
}


