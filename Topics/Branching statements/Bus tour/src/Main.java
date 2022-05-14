import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bus = scanner.nextInt();
        int bridges = scanner.nextInt();
        String message = "Will not crash";
        for (int i = 1; i <= bridges; i++) {
            int bridge = scanner.nextInt();
            if (bridge <= bus) {
                message = "Will crash on bridge " + i;
                break;
            }
        }
        System.out.println(message);
    }
}