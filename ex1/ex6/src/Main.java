import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        double num;
        Locale.setDefault(Locale.US);

        System.out.println("digite qualquer valor");
        Scanner sc = new Scanner(System.in);
        num = sc.nextDouble();
        sc.close();
        if (num >= 0 && num <= 25) {
            System.out.println("intervalo [0,25]");
        }
        else if (num > 25 && num <= 50) {
            System.out.println("intervalo [25,50]");
        }
        else if (num > 50 && num <= 75) {
            System.out.println("intervalo [50,75]");
        }
        else if (num > 75 && num <= 100) {
            System.out.println("intervalo [75,100]");
        }
        else{
            System.out.println("fora de intervalo");
        }
    }
}