package chapter10_9;

public class TrabersalTest {
    public static void main(String[] args) {
        Moor moor = new Moor(5, 6, 0.4);
        System.out.println(moor.toString());
        Traversal traversal = new Traversal(moor);
        System.out.println(traversal.toString());
        System.out.println(traversal.getCount());
    }
}
