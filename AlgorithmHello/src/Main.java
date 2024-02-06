import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        try {
            int num = scan.nextInt();
            if (num > 7) {
                System.out.println("Привет");
            } else {
                System.out.println("Вы ввели число <= 7");
            }
        } catch (InputMismatchException exc) {
            System.out.println("Ошибка, вы ввели строку");
        }
    }
}