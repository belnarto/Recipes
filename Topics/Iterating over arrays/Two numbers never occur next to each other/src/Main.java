import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] values = new int[size];

        for (int i = 0; i < size; i++) {
            values[i] = scanner.nextInt();
        }

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        boolean result = true;
        for (int i = 0; i < size - 1 && result; i++) {
            if ((values[i] == number1 && values[i + 1] == number2) ||
                    (values[i] == number2 && values[i + 1] == number1)) {
                result = false;
            }
        }
        System.out.println(result);
    }
}