import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int clientCountA = 0, clientCountB = 0, clientCountC = 0;
        int choice;
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the gas station!");
        do {
            System.out.println("Please enter the wanted fuel number: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    clientCountA++;
                    break;
                case 2:
                    clientCountB++;
                    break;
                case 3:
                    clientCountC++;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        } while (choice != 4);
        sc.close();
        System.out.println("Muito Obrigado");
        System.out.println("Alcool: " + clientCountA);
        System.out.println("Gasolina: " + clientCountB);
        System.out.println("Diesel: " + clientCountC);
    }
}