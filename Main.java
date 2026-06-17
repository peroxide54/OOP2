import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Числа от 1 до 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        int sum = 0;
        int num = 1;
        while (num <= 100) {
            sum = sum + num;
            num++;
        }
        System.out.println("Сумма чисел от 1 до 100: " + sum);
        System.out.println();
  
        String password;
        do {
            System.out.print("Введите пароль: ");
            password = scanner.nextLine();
            if (!password.equals("java123")) {
                System.out.println("Неверный пароль. Попробуйте снова.");
            }
        } while (!password.equals("java123"));
        
        System.out.println("Доступ разрешён!");
        scanner.close();
    }
}