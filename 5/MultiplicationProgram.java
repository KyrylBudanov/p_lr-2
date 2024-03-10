import java.util.Scanner;

public class MultiplicationProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, result;
        while (true) {
            System.out.print("Введіть перше число: ");
            num1 = scanner.nextInt();

            System.out.print("Введіть друге число: ");
            num2 = scanner.nextInt();

            result = num1 * num2;
            System.out.println("Результат множення: " + result);

            System.out.print("Введіть 1, щоб завершити програму, або будь-яке інше число, щоб продовжити: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                break;
            }
        }
    }
}