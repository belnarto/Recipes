import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int p = scanner.nextInt();
        int k = scanner.nextInt();

        int years = 0;
        double money = m;

        while (money < k) {
            years++;
            money *= (1 + p / 100.0);
        }

        System.out.print(years);
        // start coding here
    }
}