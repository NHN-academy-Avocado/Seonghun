import java.io.*;

public class chapter8_2 {
    public static double method() throws IOException {
        String line = "";
        int total = 0;
        int count = 0;
        while (!line.equals("0")) {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            line = br.readLine();
            total += Integer.parseInt(line);
            count += 1;
        }
        return ((double)total / (count - 1));
    }

    public static void main(String[] args) throws IOException {
        System.out.println(method());
    }
}
