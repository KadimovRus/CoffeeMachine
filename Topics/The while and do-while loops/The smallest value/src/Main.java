import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        long numberUser = scanner.nextLong();
        long number = 1;
        int count = 1;

        do {  
            number *= ++count;
        } while (number <= numberUser);
        System.out.println(count);
    }
}
