import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> guests = new ArrayList<>();
        while (scanner.hasNext()) {
            guests.add(scanner.next());
        }
        for (int i = 0; i < guests.size(); i++) {
            System.out.println(guests.get(guests.size() - i - 1));
        }
    }
}
