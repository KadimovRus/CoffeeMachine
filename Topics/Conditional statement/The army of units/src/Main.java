import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int count = scanner.nextInt();
        String result;
        if (count < 1) {
            result = "no army";
        } else if (count < 20) {
            result = "pack";
        } else if (count < 250) {
            result ="throng";
        } else if (count < 1000) {
            result = "zounds";
        } else {
            result = "legion";
        }

        System.out.println(result);
    }
}