package chapter9_6;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException, ExceptionLineTooLong {
        FileInputStream is = new FileInputStream("9_6.txt");
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String line = br.readLine();
        while (line != null) {
            if (line.length() > 80) {
                throw new ExceptionLineTooLong("문자 너무 김");
            }
            line = br.readLine();
        }
        System.out.println("hello");
    }
}
