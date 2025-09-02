import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        int choice;
        double amount, result;
        Locale.setDefault(Locale.US);

        System.out.println("escolha seu item do cardapio");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        System.out.println("escolha sua quantidade");
        amount = sc.nextInt();
        sc.close();
        switch (choice) {
            case 1:
                result = 4*amount;
                System.out.println("total: R$ " + (String.format("%.2f", result)));
            break;
            case 2:
                result = 4.50*amount;
                System.out.println("total: R$ " + (String.format("%.2f", result)));
            break;
            case 3:
                result = 5*amount;
                System.out.println("total: R$ " + (String.format("%.2f", result)));
            break;
            case 4:
                result = 2;
                System.out.println("total: R$ " + (String.format("%.2f", result)));
            break;
            case 5:
                result = 1.5;
                System.out.println("total: R$ " + (String.format("%.2f", result)));
        }
    }
}