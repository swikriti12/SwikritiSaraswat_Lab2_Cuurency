import java.util.Arrays;
import java.util.Scanner;

public class CurrencyDenomination {
    public static void paymentApproach(int[] denominations, int amount) {
        Arrays.sort(denominations);
        int[] notesCount = new int[denominations.length];

        for (int i = denominations.length - 1; i >= 0; i--) {
            notesCount[i] = amount / denominations[i];
            amount %= denominations[i];
        }

        System.out.println("Your payment approach in order to give the minimum number of notes will be:");
        for (int i = 0; i < denominations.length; i++) {
            if (notesCount[i] > 0) {
                System.out.println(denominations[i] + ":" + notesCount[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of currency denominations: ");
        int size = scanner.nextInt();

        int[] denominations = new int[size];
        System.out.print("Enter the currency denominations value: ");
        for (int i = 0; i < size; i++) {
            denominations[i] = scanner.nextInt();
        }

        System.out.print("Enter the amount you want to pay: ");
        int amount = scanner.nextInt();

        paymentApproach(denominations, amount);
    }
}
