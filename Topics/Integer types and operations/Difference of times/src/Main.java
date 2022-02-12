import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startHour = scanner.nextInt();
        int startMin = scanner.nextInt();
        int startSec = scanner.nextInt();

        int endHour = scanner.nextInt();
        int endMin = scanner.nextInt();
        int endSec = scanner.nextInt();

        System.out.println(-((startHour * 60 + startMin) * 60 + startSec ) +
                ((endHour * 60 + endMin) * 60 + endSec));
        // put your code here
    }
}
