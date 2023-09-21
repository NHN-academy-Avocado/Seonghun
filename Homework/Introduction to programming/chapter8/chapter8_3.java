import java.io.*;

public class chapter8_3 {
    public static void prints(String name) throws IOException {
        FileInputStream is = new FileInputStream(name);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String line = br.readLine();
        while (line != null) {
            if (line.startsWith("/") || line.startsWith(";") || line.startsWith("%")) {
                System.out.println(line);
            }
            line = br.readLine();
        }
    }

    public static void main(String[] args) throws IOException {
        prints("8_3.txt");
    }
}
