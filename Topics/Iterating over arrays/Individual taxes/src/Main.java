import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int companiesNumber = scanner.nextInt();
        int[] incomes = new int[companiesNumber];
        int maxTaxValueCompanyIndex = 0;
        double maxTaxValue = 0.0;

        for (int i = 0; i < companiesNumber; i++) {
            incomes[i] = scanner.nextInt();
        }

        for (int i = 0; i < companiesNumber; i++) {
            int taxRate = scanner.nextInt();
            double taxValue = incomes[i] * taxRate / 100.0;
            if (taxValue > maxTaxValue) {
                maxTaxValue = taxValue;
                maxTaxValueCompanyIndex = i;
            }
        }

        System.out.println(maxTaxValueCompanyIndex + 1);

        // write your code here
    }
}