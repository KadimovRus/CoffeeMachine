import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] arr = new int[count];
        int maxPos = 0;
        int currentPos = 0;

        for (int i = 0; i < count; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < count - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                currentPos++;
            } else {
                if (currentPos >= maxPos) {
                    maxPos = currentPos;
                }
                currentPos = 0;
            }
        }
        if (maxPos < currentPos) {
            maxPos = currentPos;
        }
        System.out.println(maxPos + 1);
    }
}