import java.util.Scanner;

class Main {
    private static final double PI = 3.14;

    public static void main(String[] args) {

        String name = "  1   "; // created an instance (1)
        System.out.println(name.isBlank());

        Math.abs(-6)

        Scanner scanner = new Scanner(System.in);
        String roomType = scanner.next();
        switch (roomType) {
            case "triangle":
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int c = scanner.nextInt();
                double halfPerimeter = (a + b + c) / 2.0;
                System.out.println(Math.sqrt(halfPerimeter *
                        (halfPerimeter - a) *
                        (halfPerimeter - b) *
                        (halfPerimeter - c)));
                break;
            case "rectangle":
                int d = scanner.nextInt();
                int e = scanner.nextInt();
                System.out.println(d * e);
                break;
            case "circle":
                int r = scanner.nextInt();
                System.out.println(PI * r * r);
                break;
            default:
                break;
        }
        // start coding here
    }
}