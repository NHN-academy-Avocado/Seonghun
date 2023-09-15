import java.util.Scanner;

public class Chapter5_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a == b && a == c) {
            System.out.println("it is irrequalr");
        } else if (a == b || a == c || b == c) {
            System.out.println("it is symmetric");
        } else {
            System.out.println("it is regular");
        }
        scanner.close();
    }
}
