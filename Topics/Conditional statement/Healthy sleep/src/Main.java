import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int low = scanner.nextInt();
        int high = scanner.nextInt();
        int current = scanner.nextInt();
        if (current < low) {
            System.out.println("Deficiency");
        } else if (current <= high) {
            System.out.println("Normal");
        } else {
            System.out.println("Excess");
        }
        // start coding here
    }
}