public class Exercise6_5 {
    public static void main(String[] args) {
        System.out.println(pi(5));
    }

    private static Double pi(int n) {
        double answer = 0;
        for (int i = 0; i<n; i++) {
            if (i%2 == 0) {
                answer += (4d/(2*i+1)); 
            } else {
                answer -= (4d/(2*i+1));
            }
        }
        return answer;
    }
}
