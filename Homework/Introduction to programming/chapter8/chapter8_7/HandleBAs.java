package chapter8_7;

import java.io.*;

public class HandleBAs {

    public static HandleBAs(String filename) throws IOException {
        FileInputStream is = new FileInputStream(filename);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String line = br.readLine();
        while (line != null) {
            new BankAccount(line, br.readLine());
            line = br.readLine();
        }
    }
}
