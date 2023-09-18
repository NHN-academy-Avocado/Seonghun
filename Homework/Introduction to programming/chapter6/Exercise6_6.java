public class Exercise6_6 {
    public static void main(String[] args) {
        System.out.println(decode("hello", 4));
    }

    private static String decode(String str, int n) {
        String answer = "";
        int len = str.length();
        for (int i = 0; i<len; i++) {
            answer += (char) (str.charAt(i) - n);
        }
        return answer;
    }
}
