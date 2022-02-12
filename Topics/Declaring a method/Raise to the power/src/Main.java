import java.util.Scanner;

public class Main {

    public static long power(int n, int m) {
        long result = 1L;
        for (int i = 1; i <= m; i++) {
            result = result * n;
        }
        return result;
        // write your code here
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        System.out.println(power(n, m));
    }
}