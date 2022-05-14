import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int count = 0;

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        if (size >= 3) {
            for (int i = 2; i < size; i++) {
                if (arr[i - 2] == arr[i - 1] - 1 && arr[i - 1] == arr[i] - 1) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}