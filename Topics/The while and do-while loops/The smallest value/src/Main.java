import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        long factorialValue = 1;
        int factorialSize = 1;

        while (factorialValue <= number) {
            factorialSize++;
            factorialValue *= factorialSize;
        }
        System.out.println(factorialSize);
        // start coding here
    }
}