import java.util.Scanner;

class Main {
    
    static final int LIMIT = 1000;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int sum = 0;
        int num = 1;
        while (sum < LIMIT && num != 0) {
            num = scanner.nextInt();
            sum += num;
        }
        if (sum >= LIMIT) {
            sum -= LIMIT;
        }
        System.out.println(sum);
    }
}
