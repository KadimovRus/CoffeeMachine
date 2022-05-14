import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        boolean itFirstInput = true;
        int max = 0;
        while (scanner.hasNext()) {
            int elem = scanner.nextInt();
            if (elem == 0) {
                break;
            }
            if (itFirstInput) {
                max = elem;
                itFirstInput = false;
            } else {
                max = Math.max(max, elem);
            }
        }
        System.out.println(max);
    }
}