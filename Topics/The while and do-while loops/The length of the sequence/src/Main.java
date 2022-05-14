import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int count = 0;
        while (scanner.hasNext()) {
            int elem = scanner.nextInt();
            if (elem == 0) {
                break;
            }
            ++count;
        }
        System.out.println(count);
    }
}