import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c;

        if (a - b > 0) {
            c = a - b;
        } else {
            c = a + b;
        }

        if (a > b) {
            c = a - b;
        } else {
            c = a + b;
        }

        if (a <= b) {
            c = a + b;
        } else {
            c = a - b;
        }

        c = (a <= b) 
                ? (a + b)
                : (a - b);
    }
}