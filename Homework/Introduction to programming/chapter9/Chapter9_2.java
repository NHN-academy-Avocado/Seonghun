public class Chapter9_2 {
    private int x = 101;

    private void f(int x) {
        x++;
        g();
    }

    private void g() {
        System.out.println(x);
    }

    public static void main(String[] args) {
        Chapter9_2 e = new Chapter9_2();
        int x = 200;
        e.f(x);
    }

    // 오류는 없고 101 출력.
    // method g 에서 x는 this.x를 말하는 것이기 때문
}
