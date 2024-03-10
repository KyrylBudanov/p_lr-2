import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть будь-яке позитивне число: ");
        int n = scanner.nextInt();

        while (n <= 0) {
            System.out.print("Число повинне бути позитивним. Введіть ще раз: ");
            n = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Сума чисел від 1 до " + n + " дорівнює " + sum);
    }
}
