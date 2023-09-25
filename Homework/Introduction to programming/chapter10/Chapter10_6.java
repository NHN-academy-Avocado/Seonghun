import java.io.*;

public class Chapter10_6 {
    private static int max = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] n = bf.readLine().split(" ");
        bf.close();
        String str = n[0];
        char c = n[1].charAt(0);
        countLengthMax(str, c, 0);
        System.out.println(max);
    }

    private static void countLengthMax(String str, char c, int now) {
        if (str.length() == 0) {
            if (now > max) {
                max = now;
            }
            return;
        }
        if (str.charAt(0) == c) {
            countLengthMax(str.substring(1), c, now+1);
        }
        if (now > max) {
            max = now;
        }
        countLengthMax(str.substring(1), c, 0);
    }
}
