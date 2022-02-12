import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i1 = scanner.nextInt();
        int i2 = scanner.nextInt();
        int i3 = scanner.nextInt();
        boolean b = (i1 + i2 == 20) || (i1 + i3 == 20) || (i3 + i2 == 20);
        System.out.println(b);
        // put your code here
    }
}
