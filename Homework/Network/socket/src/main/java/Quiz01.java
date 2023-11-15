import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;

public class Quiz01 {
    public static void main(String[] args) throws IOException {
        for (int i = Integer.parseInt(args[0]); i < Integer.parseInt(args[1]); i++) {
            try (Socket socket = new Socket("127.0.0.1", i)) {
                System.out.println("Port " + i + " 열려 있습니다.");
            } catch (ConnectException e) {
                System.out.println(e.getMessage());
            }
        }


    }
}
