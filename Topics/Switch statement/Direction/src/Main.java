import java.util.Scanner;

class Main {
    static final int UP = 1;
    static final int DOWN = 2;
    static final int LEFT = 3;
    static final int RIGHT = 4;
    static final int DO_NOT_MOVE = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = "move";
        switch (n) {
            case UP:
                s += " up";
                break;
            case DOWN:
                s += " down";
                break;
            case LEFT:
                s += " left";
                break;
            case RIGHT:
                s += " right";
                break;
            case DO_NOT_MOVE:
                s = "do not move";
                break;
            default:
                s = "error!";
                break;
        }
        System.out.println(s);
    }
}