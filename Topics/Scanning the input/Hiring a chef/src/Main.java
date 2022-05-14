import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String firstName = scanner.next();
        int experience = scanner.nextInt();
        String cuisine = scanner.next();

        System.out.printf("The form for %s is completed. " +
                          "We will contact you if we need a chef who cooks %s " +
                          "dishes and has %d years of experience.", firstName, cuisine, experience);
    }
}