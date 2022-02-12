import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int newBusHeight = scanner.nextInt();
        int numberOfBridges = scanner.nextInt();
        boolean crashed = false;

        for (int i = 1; i <= numberOfBridges && !crashed; i++) {
            int heightOfBridge = scanner.nextInt();
            if (newBusHeight >= heightOfBridge) {
                System.out.println("Will crash on bridge " + i);
                crashed = true;
            }
        }

        if (!crashed) {
            System.out.println("Will not crash");
        }
        // start coding here
    }
}