class Main {

    /**
     * @param args аргументы командной строки, не более трёх
     */
    public static void main(String[] args) {
        System.out.println("WE NEED TO"); // 'это энд оф лайн коммент
        // 'это энд оф лайн коммент


        System.out.println();
        System.out.println("LEARN JAVA");
        System.out.println();
        System.out.println("AS QUICKLY AS POSSIBLE");
        long one = 1;

        double pi = 3.1415;
        float e = 2.71828f;

        char lowerCaseLetter = 'a';
        char upperCaseLetter = 'Q';
        char dollar = '$';
        String whitespace = "  ";

        boolean enabled = true;
        boolean bugFound = false;

        int var1 = 100;
        long var2 = var1;

        long var3 = 100L;
        int var4 = (int) var3;


        int num = 100;
        long bigNum = num; // 100L

        long bigNum2 = 100_000_000L;
        double bigFraction = bigNum2; // 100000000.0

        short shortNum = 100;
        int num3 = shortNum; // 100

        char ch = '?';
        double code = ch; // 63

        long bigLong = 1_200_000_002L;
        float bigFloat = bigLong; // 1.2E9 (= 1_200_000_000)




        double d = 2.00003;

// it loses the fractional part
        long l = (long) d; // 2

// requires explicit casting because long is wider than int
        int i = (int) l; // 2

// requires explicit casting because the result is long (indicated by L)
        int val = (int) (3 + 2L); // 5

// casting from a long literal to char
        char ch123 = (char) 55L; // '7'




        long bigNum333 = 100_000_000_000_000L;
        int n = (int) bigNum; // 276_447_232





        int num3223 = 10;
        long bigNum12312 = (long) num3223; // redundant casting
    }
}