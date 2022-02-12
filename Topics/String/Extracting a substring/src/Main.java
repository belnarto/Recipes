import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        System.out.print(text.substring(start, end + 1));
        // start coding here

        final boolean FALSE;       // not initialized
        FALSE = false;             // initialized
        System.out.println(FALSE); // no errors here// error line
    }
}