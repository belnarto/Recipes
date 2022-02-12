// You can experiment here, it won’t be checked

import java.util.Scanner;

public class Main {

    public static final int ZERO = 0;
    public static final int TEN = 10;
    public static final int HUNDRED = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n1 = a % TEN;
        int n2 = a / TEN % TEN;
        int n3 = a / HUNDRED;

        if (n1 == ZERO) {
            System.out.print(n2);
            System.out.print(n3);
        } else {
            System.out.print(n1);
            System.out.print(n2);
            System.out.print(n3);

        }
    }
}
