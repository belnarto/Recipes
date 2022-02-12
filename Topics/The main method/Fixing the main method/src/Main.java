class Main {

    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }

    public static void print(String stringToPrint) {
        System.out.println(stringToPrint);
    }

    public static void print(String stringToPrint, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(stringToPrint);
        }
    }

    public static void print(int times, String stringToPrint) {
        for (int i = 0; i < times; i++) {
            System.out.println(stringToPrint);
        }
    }

    public static void print(int val) {
        System.out.println(val);
    }
}