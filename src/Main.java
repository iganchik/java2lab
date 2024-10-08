import java.util.regex.*;
import java.util.Scanner;

public class Main {
    static void inputip() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите IP-адрес: ");
        String input = scanner.nextLine();


        Pattern p1 = Pattern.compile("^([2][0-5][0-5]|[2][0-4][0-9]|[1][0-9][0-9]|[0-9][0-9]|[0-9]).([2][0-5][0-5]|[2][0-4][0-9]|[1][0-9][0-9]|[0-9][0-9]|[0-9]).([2][0-5][0-5]|[2][0-4][0-9]|[1][0-9][0-9]|[0-9][0-9]|[0-9]).([2][0-5][0-5]|[2][0-4][0-9]|[1][0-9][0-9]|[0-9][0-9]|[0-9])$");
        Matcher m1 = p1.matcher(input);

        boolean isIP = m1.matches();

        if (isIP) {
            System.out.println("Это корректный IP-адрес.");
        } else {
            System.out.println("Это некорректный IP-адрес.");
        }
    }

    public static void main(String[] args) {
        // Вызов функции для проверки IP-адреса
        inputip();
    }
}