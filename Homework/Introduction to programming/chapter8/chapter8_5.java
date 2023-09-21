import java.io.*;

public class chapter8_5 {
    public static String bestStudent() throws IOException {
        FileInputStream is = new FileInputStream("8_5.txt");
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String line = br.readLine();
        String answer = "";
        int max = 0;
        while (line != null) {
            String[] arr = line.split(" ");
            int len = arr.length;
            int total = 0;
            for (int i = 1; i < len; i++) {
                total += Integer.parseInt(arr[i]);
            }
            if (total / (len - 1) > max) {
                max = total / (len - 1);
                answer = arr[0];
            }
            line = br.readLine();
        }
        br.close();
        return answer;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(bestStudent());
    }
}
