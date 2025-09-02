import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int hora_a, hora_b;
        int resultado;

        System.out.println("digite a hora a");
        Scanner sc = new Scanner(System.in);
        hora_a = sc.nextInt();
        System.out.println("digite a hora b");
        hora_b = sc.nextInt();
        sc.close();
        if (hora_a > hora_b) {
            resultado = 24 - hora_a + hora_b;
        } else if (hora_b == hora_a) {
            resultado = 24;
        } else {
            resultado = hora_b - hora_a;
        }
        System.out.println("o jogo durou " + resultado + " horas");
    }
}