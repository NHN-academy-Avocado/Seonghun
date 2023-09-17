import java.util.Scanner;

public class Chapter5_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        char c = a.charAt(a.length()-1);
        if (a.substring(0, 5).equals("vocal")) {
            System.out.print("MAYBE ");
        }
        if (c == 'a' || c == 'i' || c == 'u') {
            System.out.println("YES");
        } else if (c == 'e' || c == 'o') {
            System.out.println("NO");
        } else {
            System.out.println("DON'Y KNOW");
        }
        scanner.close();
    }
}
