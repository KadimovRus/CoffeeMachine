import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String[] entrance = scanner.nextLine().split(" ");
        int count = scanner.nextInt();
        String temp;
        int entranceLen = entrance.length;

        for (int i = 0; i < count; i++) {
            temp = entrance[entranceLen - 1];
            for (int c = entranceLen - 1; c > 0; c--) {
                entrance[c] = entrance[c - 1];
            }
            entrance[0] = temp;
        }
        System.out.println(Arrays.toString(entrance)
                .replace("[", "")
                .replace("]", "")
                .replace(",", ""));
    }
}
