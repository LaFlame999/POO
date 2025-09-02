import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;

        System.out.println("digite um numero");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();
        if (num % 2 == 0) {
            System.out.println("par");
        }
        else {
            System.out.println("impar");
        }
    }
}