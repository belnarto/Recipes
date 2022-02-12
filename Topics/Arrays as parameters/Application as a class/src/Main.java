class Application {

    void run(String[] args) {
//        for (int i = 0; i < args.length; i++) {
//            System.out.println(args[i]);
//        }
        for (String line : args) {
            System.out.println(line);
        }

        String text = "test1";
        text = text + " test2";

        char[] chars = text.toCharArray();
        String str = new String("my-string");
        // implement me


        String first = "first";
        String second = "second";

        String anotherFirst = "first";
        String secondInUpperCase = "SECOND";

        boolean same = first == anotherFirst;


        System.out.println(first.equals(second)); // false, the strings have different values
        System.out.println(first.equals(anotherFirst)); // true, the strings have the same value

        System.out.println(second.equals(secondInUpperCase)); // false, the strings have different cases
        System.out.println(second.equalsIgnoreCase(secondInUpperCase)); // true, it ignores cases
    }
}