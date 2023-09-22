public class Exercise6_2 {
    public static void main(String[] args) {
        printEvenNumber(5);
    }

    private static void printEvenNumber(int n) {
        for (int i = 2; i < 2*n+1; i+=2) {
            System.out.print(i + " ");
        }
    }
}
