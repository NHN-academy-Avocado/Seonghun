import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;

public class Quiz03 {
    public static void main(String[] args) throws IOException {
        String ip = "localhost";
        int port = 1234;
        if (args.length == 2) {
            ip = args[0];
            port = Integer.parseInt(args[1]);
        } else if (args.length == 1) {
            ip = args[0];
        }
        try (Socket socket = new Socket(ip, port)) {
            System.out.println("서버에 연결되었습니다.");
            System.out.println("Local address : " + socket.getLocalSocketAddress());
            System.out.println("Local port : " + socket.getLocalPort());
            System.out.println("Remote address : " + socket.getRemoteSocketAddress());
            System.out.println("Remote port : " + socket.getPort());
        } catch (ConnectException e) {
            System.out.println(ip + ":" + port + "에 연결할 수 없습니다.");
        }
    }
}
