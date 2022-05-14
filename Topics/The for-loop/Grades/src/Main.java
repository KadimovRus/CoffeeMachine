import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        String grade = "";
        for (int i = 1; i <= n; i++) {
            grade = scanner.next();
            if ("A".equals(grade)) {
                countA += 1;
            } else if ("B".equals(grade)) {
                countB += 1;
            } else if ("C".equals(grade)) {
                countC += 1;
            } else if ("D".equals(grade)) {
                countD += 1;
            }
        }
        System.out.print(countD + " " + countC + " " + countB + " " + countA);
    }
}
