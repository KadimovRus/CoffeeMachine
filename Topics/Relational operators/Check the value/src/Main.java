import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        boolean result = count < 10 && count > 0;
        System.out.println(result);
    }
}