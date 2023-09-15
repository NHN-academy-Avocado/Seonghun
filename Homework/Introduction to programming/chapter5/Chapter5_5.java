import java.util.Scanner;

public class Chapter5_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int discriminant = (b * b) - (4 * a * c);
        if (discriminant == 0) {
            System.out.println(-b / (2 * a) );
        } else if (discriminant > 0) {
            System.out.print((-b + discriminant) / (2 * a) + ", ");
            System.out.println((-b - discriminant) / (2 * a));
        } else {
            System.out.print(("(" + -b) + "+" + (-1 * discriminant) + "i) / " + (2*a) + ", ");
            System.out.println(("(" + -b) + "-" + (-1 * discriminant) + "i) / " + (2*a) + ", ");
        }
        scanner.close();
    }
}
