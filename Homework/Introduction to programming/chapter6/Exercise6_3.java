public class Exercise6_3 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    private static int factorial(int n) {
        if (n < 0) {
            System.out.println("0보다 커야함");
        }
        int answer = 1;
        for (int i = 2; i<n+1; i++) {
            answer *= i;
        }
        return answer;
    }
}