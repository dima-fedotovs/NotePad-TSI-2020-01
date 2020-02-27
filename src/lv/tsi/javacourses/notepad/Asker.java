package lv.tsi.javacourses.notepad;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Asker {
    private static Scanner scan = new Scanner(System.in);

    public static String askString(String msg) {
        System.out.print(msg + ": ");
        return scan.next();
    }

    public static int askInt(String msg, int min, int max) {
        for (;;) {
            int result = askInt(msg);
            if (result < min || result > max) {
                System.out.printf(
                "Value should be in range from %d to %d%n", min, max);
            } else {
                return result;
            }
        }
    }

    public static int askInt(String msg) {
        for (;;) {
            try {
                System.out.print(msg + ": ");
                return scan.nextInt();
            } catch (InputMismatchException e) {
                var str = scan.next();
                System.out.println(str + " isn't an integer. Please enter integer value");
            }
        }
    }
}
