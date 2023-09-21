package chapter8_6;

import java.io.*;

public class IOFile {
    private String filename;

    public IOFile(String filename) {
        this.filename = filename;
    }

    public int countLines() throws IOException {
        int count = 0;
        FileInputStream is = new FileInputStream(this.filename);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String line = br.readLine();
        while (line != null) {
            count++;
        }
        br.close();
        return count;
    }

    public void write(OutputStream os) throws IOException {
        PrintWriter pw = new PrintWriter(os);
        FileInputStream is = new FileInputStream(this.filename);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String line = br.readLine();
        while (line != null) {
            pw.println(line);
        }
        br.close();
    }

    public void print() throws IOException {
        FileInputStream is = new FileInputStream(this.filename);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String line = br.readLine();
        while (line != null) {
            System.out.println(line);
        }
        br.close();
    }

    public void copy(String filename) throws IOException {
        FileInputStream is = new FileInputStream(this.filename);
        FileOutputStream os = new FileOutputStream(filename, false);
        InputStreamReader isr = new InputStreamReader(is);
        PrintStream pw = new PrintStream(os);
        BufferedReader br = new BufferedReader(isr);
        String line = br.readLine();
        while (line != null) {
            pw.println(line);
            line = br.readLine();
        }
        br.close();
        pw.close();
    }

    public void delete() {
        File f1 = new File(this.filename);
        f1.delete();
    }
}
