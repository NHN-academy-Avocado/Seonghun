import java.util.Scanner;

public class Chapter2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
        System.out.println(str);
        scanner.close();
    }
}