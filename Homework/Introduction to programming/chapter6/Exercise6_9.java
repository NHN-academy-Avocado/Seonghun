public class Exercise6_9 {
    public static void main(String[] args) {
        pyramid(5);
    }

    private static void pyramid(int h) {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j<h-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++) {
                System.out.print(j+1);
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
