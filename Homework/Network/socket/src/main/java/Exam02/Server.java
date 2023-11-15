package Exam02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        try (Socket socket = new Socket("127.0.0.1", 9797)) {
            System.out.println("Port " + 9797 + " 열려 있습니다.");
            send(socket);
            InputStream is = socket.getInputStream();
            byte[] recvBuffer = new byte[1024];
            is.read(recvBuffer);
        } catch (ConnectException e) {
            System.out.println(e.getMessage());
        }

    }

    private static void send(Socket socket) throws IOException {
        String temp = "안녕하세요.";

        OutputStream os = socket.getOutputStream();
        os.write(Byte.parseByte(temp));
        os.flush();
    }
}
