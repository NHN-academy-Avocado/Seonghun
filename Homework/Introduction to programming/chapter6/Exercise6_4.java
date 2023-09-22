import java.util.Scanner;

public class Exercise6_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int negativeAnswer = 0;
        int positiveAnswer = 0;
        String[] arr = scanner.nextLine().split(" ");
        for (int i = 0; i<n; i++) {
            if (arr[i].charAt(0) == '-') {
                negativeAnswer += Integer.parseInt(arr[i]);
            } else {
                positiveAnswer += Integer.parseInt(arr[i]);
            }
        }
        scanner.close();
        System.out.println("음수 합: " + negativeAnswer);
        System.out.println("양수 합: " + positiveAnswer);
    }
}
