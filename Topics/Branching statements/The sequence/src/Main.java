import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countToBePrinted = scanner.nextInt();
        int currentNumber = 1;
        for (int countOfPrinted = 1; countOfPrinted <= countToBePrinted; ) {
            for (int countOfPrintedInSeries = currentNumber;
                 countOfPrintedInSeries != 0 && countOfPrinted <= countToBePrinted;
                 countOfPrintedInSeries--) {
                System.out.print(currentNumber + " ");
                countOfPrinted++;
            }
            currentNumber++;
        }
        // start coding here
    }
}