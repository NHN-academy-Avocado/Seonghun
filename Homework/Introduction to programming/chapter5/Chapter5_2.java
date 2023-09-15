import java.util.Scanner;

public class Chapter5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int equal = countEqual(a, b, c);
        if (equal == 0) {
            System.out.println("it is irrequalr");
        } else if (equal == 1) {
            System.out.println("it is symmetric");
        } else {
            System.out.println("it is regular");
        }
        scanner.close();
    }

    public static int countEqual(int a, int b, int c) {
        int equal = 0;
        if (a == b) {
            equal++;
        }
        if (a == c) {
            equal++;
        }
        if (b == c) {
            equal++;
        }
        return equal;
    }
    
}
