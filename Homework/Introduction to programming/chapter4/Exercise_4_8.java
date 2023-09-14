public class Exercise_4_8 {
    public static void method(int a, Account b) {
        a *= 2;
        b.bal *= 2;
    }
    public static void main(String[] args) {
        int c = 100;
        Account r = new Account(100);
        method(c,r);
        System.out.println(c + " " + r.bal);
    }

    // 출력: 100 200
}
