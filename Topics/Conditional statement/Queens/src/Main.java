import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q1x = scanner.nextInt();
        int q1y = scanner.nextInt();
        int q2x = scanner.nextInt();
        int q2y = scanner.nextInt();

        if (q1x == q2x || q1y == q2y) {
            System.out.println("YES");
        } else if (Math.abs(q1x - q2x) == Math.abs(q1y - q2y)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        // start coding here
    }
}