import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Digit X: ");
            x = sc.nextInt();
            System.out.println("Digit Y: ");
            y = sc.nextInt();

            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo ");
            } else if (x > 0 && y < 0) {
                System.out.println("quarto ");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro ");
            }
        } while (x != 0 && y != 0);
      sc.close();
    }
}