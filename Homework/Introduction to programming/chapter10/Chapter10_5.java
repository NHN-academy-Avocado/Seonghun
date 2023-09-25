import java.io.*;

public class Chapter10_5 {
    public static void main(String[] args) throws IOException {
        FileInputStream is = new FileInputStream("10_5.txt");
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        System.out.println(readFile(br));
    }

    private static int readFile(BufferedReader br) throws NumberFormatException, IOException {
        String line = br.readLine();
        if (line == null) {
            return 0;
        }
        if (Integer.parseInt(line) == 1) {
            return 1 + readFile(br);
        }
        return readFile(br);
    }
}
