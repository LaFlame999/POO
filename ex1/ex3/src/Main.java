import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b;
        int result;

        System.out.println("Enter 2 numbers");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();
        if (a % b == 0 || b % a == 0) {
            System.out.println("os numeros a e b sao multiplos");
        }
        else {
            System.out.println("os numeros a e b nao sao multiplos");
        }
    }
}