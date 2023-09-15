import javax.swing.JOptionPane;

public class Chapter4 {

    // Exercise 4.1
    public static double convertLireEuro(int x) {
        return x * 1.16;
    }

    // Exercise 4.2
    public static boolean sumOverflow(byte x, byte y) {
        if (x + y > Byte.MAX_VALUE) {
            return true;
        }
        return false;
    }

    // Exercise 4.3
    public static void printNumber() {
        int a = Integer.parseInt(JOptionPane.showInputDialog("첫 번째 정수 입력"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("두 번째 정수 입력"));
        System.out.println("산술평균: " + a+b/2);
        System.out.println("기하평균: " + Math.sqrt(a*b));
        System.out.println("더 큰 숫자" + Math.max(a, b));
        System.out.println("더 작은 숫자" + Math.min(a, b));
    }

    // Exercise 4.4
    public static boolean even(long x) {
        if (x % 2 == 0) {
            return true;
        }
        return false;
    }

    // Exercise 4.5
    public static void notError() {
        short x = 22;
        byte y = (byte) x;
        System.out.println(y);
    }

    // Exercise 4.6
    /* 
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean b1, b2;

    1. b+10L  =>  long
    2. (b+i)*l  =>  long
    3. (b+i)*l+f  =>  float
    4. s/f + Math.sin(f)  =>  double
    5. c == '비'  =>  boolean
    6. l+1.5f  =>  float
    7. 나는<10  =>  boolean
    8. b1 == (f >= 5.0)  =>  boolean
    9. b1 && !b2  =>  boolean
    */

    // Exercise 4.7
    /*
    s = 65L;  =>  error
    f = i+100;
    나는 = 2*b+l;  =>  error
    b1 = s;  =>  error
    b2 = s >= 57;
    x = b;  =>  error
    c = 'b';
    */

    // Exercise 4.8
    // 별도 파일


    // Exercise 4.9
    // 별도 파일


    // Exercise 4.10
    public static char lastCharacter(String s) {
        return s.charAt(s.length()-1);
    }

}