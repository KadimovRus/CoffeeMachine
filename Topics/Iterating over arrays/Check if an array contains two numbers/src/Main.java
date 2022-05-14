import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] arr = new int[count];

        for (int i = 0; i < count; i++) {
            arr[i] = scanner.nextInt();
        }

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        boolean result = false;
        for (int i = 0; i < count - 1; i++) {
            if (arr[i] == num1 && arr[i + 1] == num2 || arr[i] == num2 && arr[i + 1] == num1) {
                result = true;
                break;
            }
        }
        System.out.println(result);
    }
}