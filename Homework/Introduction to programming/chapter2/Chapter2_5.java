import java.util.Scanner;

public class Chapter2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder str = new StringBuilder(scanner.nextLine());
        str = str.insert(str.length(), str.charAt(0));
        str = str.insert(0, str.charAt(str.length() - 2));
        str.deleteCharAt(1);
        str.deleteCharAt(str.length() - 2);
        System.out.println(str);
        scanner.close();
    }
}
