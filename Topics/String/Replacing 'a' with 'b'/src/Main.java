import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next().toString();
        s = s.replace("a", "b");
        System.out.println(s);
    }
}