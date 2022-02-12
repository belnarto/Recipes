import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number1 = scanner.nextLong();
        String operator = scanner.next();
        long number2 = scanner.nextLong();
        switch (operator) {
            case "+":
                System.out.println(number1 + number2);
                break;
            case "-":
                System.out.println(number1 - number2);
                break;
            case "/":
                System.out.println(number2 != 0 ? number1 / number2 : "Division by 0!");
                break;
            case "*":
                System.out.println(number1 * number2);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
        // start coding here
    }
}