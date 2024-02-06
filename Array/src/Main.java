import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа для массива через запятую (Например: 1,2,3)");
        String array = scanner.nextLine();
        String[] inputDataStrArray = array.split(",");
        double[] inputDataNumArray = new double[inputDataStrArray.length];
        try {
            for (int i = 0; i < inputDataStrArray.length; i++) {
                double num = Double.parseDouble(inputDataStrArray[i]);
                inputDataNumArray[i] = num;
            }
            for (int i = 0; i < inputDataStrArray.length; i++) {
                if (inputDataNumArray[i] % 3 == 0) {
                    System.out.println(inputDataStrArray[i]);
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Ошибка. Один из введеных элементов не является числом");
        }
    }
}