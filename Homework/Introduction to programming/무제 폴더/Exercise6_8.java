public class Exercise6_8 {
    static final int NMAX = 10;
    
    public static void main (String[] args) {
        int row, column;
    
        for (row = 1; row <= NMAX; row++) {
            for (column = 1; column <= NMAX; column++) {
                System.out.print(row * column + "  ");
                if (row * column < 10) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
      
}
