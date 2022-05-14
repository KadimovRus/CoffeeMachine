// Don't delete scanner import
import java.io.PrintStream;
import java.util.Formatter;
import java.util.Scanner;

class Name {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    // use this program as a source of inspiration for your method

        method(null);
    }

    //implement your method here
    public static void method(int... vararg) {
        System.out.println(vararg.length);
    }
}