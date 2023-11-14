import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S2_1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line = bf.readLine();
        int len = line.length();
        StringBuilder temp = new StringBuilder("");
        int answer = 0;
        int i = 0;
        while (i < len) {
            if (Character.isDigit(line.charAt(i))) {
                temp.append(line.charAt(i));
                i++;
            } else if (line.charAt(i) == '+'){
                answer += Integer.parseInt(temp.toString());
                temp.delete(0, temp.length());
                i++;
            } else {
                answer += Integer.parseInt(temp.toString());
                temp.delete(0, temp.length());
                i++;
                while (i < len) {
                    if (Character.isDigit(line.charAt(i))) {
                        temp.append(line.charAt(i));
                        i++;
                    } else {
                        answer -= Integer.parseInt(temp.toString());
                        temp.delete(0, temp.length());
                        i++;
                    }
                }
                answer -= Integer.parseInt(temp.toString());
                temp.delete(0, temp.length());
            }
        }
        if (temp.length() != 0) {
            answer += Integer.parseInt(temp.toString());
        }
        System.out.println(answer);
    }
}