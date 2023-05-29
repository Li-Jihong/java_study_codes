package _14_.shiyan1;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * \* Created with IntelliJ IDEA.
 * \* @ProjectName: java_study_codes
 * \* @FileName: Sever
 * \* @author: li-jihong
 * \* Date: 2023-05-29 17:27
 */
public class Sever {
    public static void main(String[] args) {
        ServerSocket server = null;
        ServerThread thread;
        Socket you = null;
        while (true) {
            try {
                server = new ServerSocket(4331);
            } catch (IOException e1) {
                System.out.println("正在监听");
            }
            try {
                you = server.accept();
                System.out.println("客户的地址：" + you.getInetAddress());
            } catch (IOException e) {
                System.out.println("正在等待客户");
            }
            if (you != null) {
                new ServerThread(you).start();
            }
        }
    }
}

class ServerThread extends Thread {
    Socket socket;
    ObjectInputStream in = null;
    ObjectOutputStream out = null;
    JFrame window;
    JTextArea text;

    ServerThread(Socket t) {
        socket = t;
        try {
            out = new ObjectOutputStream(socket.getOutputStream());
            in = new ObjectInputStream(socket.getInputStream());
        } catch (IOException E) {
        }
        window = new JFrame();
        text = new JTextArea();
        for (int i = 1; i <= 20; i++) {
            text.append("你好，我是服务器上的文本区组件\n");
        }
        text.setBackground(Color.yellow);
        window.add(text);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void run() {
        try {
            out.writeObject(window);
        } catch (IOException e) {
            System.out.println("客户离开");
        }
    }
}
