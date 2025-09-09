import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int digitedPassword;
        int password = 2002;

        System.out.println("write your password ");
        Scanner sc = new Scanner(System.in);
        digitedPassword = sc.nextInt();
        do {

            if (digitedPassword == password) {
                System.out.println("success!");
            } else {
                System.out.println("wrong password!, try again ");
                digitedPassword = sc.nextInt();
            }
        }while (digitedPassword != password);
        sc.close();
    }
}