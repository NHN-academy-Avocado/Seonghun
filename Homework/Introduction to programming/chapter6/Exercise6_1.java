import java.util.Scanner;

public class Exercise6_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            int temp = scanner.nextInt();
            if (temp < min) {
                min = temp;
            }
        }
        scanner.close();
        System.out.println(min);
    }
}