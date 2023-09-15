import javax.swing.JOptionPane;

public class Chapter5_1{
    public static void main(String[] args) {
        float g = Float.parseFloat(JOptionPane.showInputDialog("실수를 입력"));
        if (g > 40) {
            System.out.println("extra strong liquor");
        } else if (g > 20) {
            System.out.println("strong liquor");
        } else if (g > 15) {
            System.out.println("liquor");
        } else if (g > 12) {
            System.out.println("strong vine");
        } else if (g > 10.5) {
            System.out.println("normal vine");
        } else {
            System.out.println("light vine");
        }
    }
}