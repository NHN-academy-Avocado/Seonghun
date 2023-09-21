import java.io.*;

public class chapter8_4 {
    public static void makeFile(String name, int n) throws IOException {
        FileWriter f = new FileWriter(name);
        PrintWriter out = new PrintWriter(f);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j < n; j++) {
                out.print(arr[j] * i);
            }
            out.println();
        }
        out.close();
    }

    public static void main(String[] args) throws IOException {
        makeFile("8_4.txt", 3);
    }
}
