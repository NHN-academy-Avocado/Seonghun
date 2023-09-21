package chapter8_1;

import java.io.*;

public class IOStrings {
    public static void saveArray(OutputStream os, String[] sa) {
        PrintStream pw = new PrintStream(os);
        for (String str : sa) {
            pw.println(str);
        }
        pw.close();
    }

    public static String[] loadArray(InputStream is, int n) throws IOException {
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String line = br.readLine();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = line;
            line = br.readLine();
        }
        return str;
    }

    public static void main(String[] args) throws IOException {
        FileInputStream is = new FileInputStream("8_1.txt");
        FileOutputStream os = new FileOutputStream("8_1.txt", true);
        saveArray(os, loadArray(is, 5));
        for (String str : loadArray(is, 5)) {
            System.out.println(str);
        }
    }
}