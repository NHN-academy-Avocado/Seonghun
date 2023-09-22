import java.io.*;

public class Chapter9_7 {
    public static boolean fileExists(String filename) {
        File file = new File(filename);
        if (file.exists()) {
            return true;
        }
        return false;
    }

    public static boolean isInt(String number) {
        char[] arr = number.toCharArray();
        for (char i: arr) {
            if (!Character.isDigit(i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDouble(String number) {
        char[] arr = number.toCharArray();
        for (char i: arr) {
            if (!Character.isDigit(i) && i != '.') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(fileExists("9_6.txt"));
        System.out.println(fileExists("hello.txt"));
        System.out.println(isInt("8"));
        System.out.println(isInt("8a"));
        System.out.println(isDouble("12.34"));
        System.out.println(isDouble("12.34a"));
    }
}
