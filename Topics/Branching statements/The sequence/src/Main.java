import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        int count = 1;
        for (int i = 1; i <= n && count <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println(i);
                count++;
                if (count > n) {
                    break;
                }
            }
        }
    }
}
