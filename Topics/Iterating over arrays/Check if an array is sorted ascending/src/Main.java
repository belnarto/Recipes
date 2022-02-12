import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] values = new int[size];
        values[0] = scanner.nextInt();
        boolean asc = true;
        for (int i = 1; i < size && asc; i++) {
            int nextValue = scanner.nextInt();
            values[i] = nextValue;
            if (nextValue < values[i - 1]) {
                asc = false;
            }
        }
        System.out.println(asc);
    }
}