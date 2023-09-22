public class Chapter9_1 {
    // public static void main(String[] args) {
    //     // for문의 문법 오류로 컴파일오류
    //     for (int i = 0, j = 0; i < 10, j < 10; i++, j++) {
    //         System.out.println(i + " + " + j + " = " + (i+j));
    //     }
    //     // i와 j가 정의되어있지 않아서 컴파일 오류
    //     System.out.println("I've printed out the sums of i and j up to " + i + "," + j);
    // }

    public static void main(String[] args) {
        int j =0;
        int i = 0;
        for (i = 0; i < 10; i++) {
            System.out.println(i + " + " + i + " = " + (i+i));
        }
        System.out.println("I've printed out the sums of i and j up to "
        + j + "," + (i-1));
    }
}