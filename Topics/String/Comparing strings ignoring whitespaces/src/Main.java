import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstLine = scanner.nextLine().trim().replace(" ", "");
        String secondLine = scanner.nextLine().trim().replace(" ", "");
        System.out.println(firstLine.equalsIgnoreCase(secondLine));
        // start coding here
    }
}