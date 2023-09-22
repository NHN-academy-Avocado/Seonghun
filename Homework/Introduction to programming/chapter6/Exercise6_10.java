public class Exercise6_10 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i<n+1; i++) {
            System.out.println(factorial(i));
        }
        
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
