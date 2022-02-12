import java.util.*;

public class Main {

    public static void main(String[] args) {
        printPow(2, 2);
    }

    public static int pow(int first, int second) {
        int result = 1;
        for (int i = 1; i <= second; i++) {
            result *= first;
        }
        return result;
    }

    public static void printPow(int first, int second) {
        int result = 1;
        for (int i = 1; i <= second; i++) {
            result *= first;
        }
        System.out.println(result);
    }
}