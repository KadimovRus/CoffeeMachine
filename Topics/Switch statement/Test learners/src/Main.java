import java.util.Scanner;

class Main {
    static final int JAVA = 1;
    static final int KOTLIN = 2;
    static final int SCALA = 3;
    static final int PYTHON = 4;

    public static void main(String[] args) {
        int var1 = 100;
        int var2 = 0;
        switch (var1) {
            case 100:
                var2 += var1;
            case 200:
                var2 += var1 / 4;
                break;
            case 300:
                var2 += var1 / 10;
                break;
        }
        System.out.println(var2);
    }
}