package _14_.shiyan1;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * \* Created with IntelliJ IDEA.
 * \* @ProjectName: java_study_codes
 * \* @FileName: Client
 * \* @author: li-jihong
 * \* Date: 2023-05-29 17:28
 */
public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Socket mysocket = null;
        ObjectInputStream inObject = null;
        ObjectOutputStream outObject = null;
        Thread thread;
        ReadWindow readWindow = null;
        try {
            mysocket = new Socket();
            readWindow = new ReadWindow();
            thread = new Thread(readWindow);
            System.out.print("输入服务器的IP：");
            String IP = scanner.nextLine();
            System.out.print("输入端口号");
            int port = scanner.nextInt();
            if (mysocket.isConnected()) {
            } else {
                InetAddress address = InetAddress.getByName(IP);
                InetSocketAddress socketAddress = new InetSocketAddress(address, port);
                mysocket.connect(socketAddress);
                InputStream in = mysocket.getInputStream();
                OutputStream out = mysocket.getOutputStream();
                inObject = new ObjectInputStream(in);
                outObject = new ObjectOutputStream(out);
                readWindow.setObjectInputStream(inObject);
                thread.start();
            }
        } catch (Exception e) {
            System.out.println("服务器以断开" + e);
        }
    }
}

class ReadWindow implements Runnable {
    ObjectInputStream in;

    public void setObjectInputStream(ObjectInputStream in) {
        this.in = in;
    }

    public void run() {
        double result = 0;
        while (true) {
            try {
                javax.swing.JFrame window = (javax.swing.JFrame) in.readObject();
                window.setTitle("这是从服务器上读入的窗口");
                window.setVisible(true);
                window.requestFocusInWindow();
                window.setSize(600, 800);
            } catch (Exception e) {
                System.out.println("与服务器已断开" + e);
                break;
            }
        }
    }
}
