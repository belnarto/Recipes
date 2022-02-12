import java.util.Scanner;

class FixingArithmeticException {

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 10, 6 }; // the order is broken

        boolean broken = false; // suppose the array is well-ordered

        /* iterating over the array */
        for (int i = 1; i < numbers.length && !broken; i++) {

            if (numbers[i] < numbers[i - 1]) { // if the order is broken
                broken = true; // write a result
            }
        }

        if (broken) {
            System.out.println("BROKEN");
        } else {
            System.out.println("OK");
        }
    }
}