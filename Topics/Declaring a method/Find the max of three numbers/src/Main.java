import java.util.Scanner;

public class Main {

    public static int getNumberOfMaxParam(int a, int b, int c) {
        int max = Math.max(Math.max(a, b), c);
        int poz = 0;
        if (a == max) {
            poz = 1;
        } else if (b == max) {
            poz = 2;
        } else if (c == max) {
            poz = 3;
        }
        return poz;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        System.out.println(getNumberOfMaxParam(a, b, c));
    }
}
