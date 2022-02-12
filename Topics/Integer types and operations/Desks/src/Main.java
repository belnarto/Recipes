import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int group1 = scanner.nextInt();
        int group2 = scanner.nextInt();
        int group3 = scanner.nextInt();

        int desksGroup1 = group1 / 2 + group1 % 2;
        int desksGroup2 = group2 / 2 + group2 % 2;
        int desksGroup3 = group3 / 2 + group3 % 2;

        System.out.println(desksGroup1 + desksGroup2 + desksGroup3);
        // put your code here
    }
}