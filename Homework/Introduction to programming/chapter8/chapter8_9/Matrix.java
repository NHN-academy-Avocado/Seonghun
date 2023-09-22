package chapter8_9;

import java.io.*;

public class Matrix {
    private int[][] arr;
    private int n;
    private int m;


    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        this.arr = new int[n][m];
    }

    public void save(String filename) throws FileNotFoundException {
        FileOutputStream os = new FileOutputStream(filename, false);
        PrintStream pw = new PrintStream(os);
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.n; j++) {
                pw.print(this.arr[i][j] + " ");
            }
            pw.println();
        }
        pw.close();
    }

    public static Matrix read(String filename) throws IOException {
        FileInputStream is = new FileInputStream(filename);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String line = br.readLine();
        int n = 0;
        int m = line.length();
        while (line != null) {
            n += 1;
            line = br.readLine();
        }
        is.close();
        is = new FileInputStream(filename);
        isr = new InputStreamReader(is);
        br = new BufferedReader(isr);
        Matrix temp = new Matrix(n, m);
        line = br.readLine();
        for (int i = 0; i < n; i++) {
            String[] str = line.split(" ");
            for (int j = 0; j < m; j++) {
                temp.arr[i][j] = Integer.parseInt(str[j]);
            }
            line = br.readLine();
        }
        br.close();
        return temp;
    }

    public Matrix sum(Matrix m) {
    
        if (this.n == m.n && this.m == m.m) {
            Matrix matrix = new Matrix(this.n, this.m);
            for(int i = 0; i < this.n; i++) {
                for (int j = 0; j < this.m; j++) {
                    matrix.arr[i][j] = this.arr[i][j] + m.arr[i][j];
                }
            }
            return matrix;
        }
        return null;
    }

    public Matrix product(Matrix m) {
        if (this.n == m.m && this.m == m.n) {
            Matrix matrix = new Matrix(this.n, this.m);
            for(int i = 0; i < this.n; i++) {
                for (int j = 0; j < this.m; j++) {
                    for (int k = 0; k < this.m; k++) {
                        matrix.arr[i][j] += this.arr[i][k] * this.arr[k][j];
                    }
                }
            }
            return matrix;
        }

        return null;
    }
}