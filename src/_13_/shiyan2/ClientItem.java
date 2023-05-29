package _13_.shiyan2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientItem {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Socket clientSocket = null;
        DataInputStream inData = null;
        DataOutputStream outData = null;
        Thread thread;
        Read read = null;
        try {
            clientSocket = new Socket();
            read = new Read();
            thread = new Thread(read);   //负责读取信息的线程
            System.out.print("输入服务器的IP:");
            String IP = scanner.nextLine();
            System.out.print("输入端口号:");
            int port = scanner.nextInt();
            String enter = scanner.nextLine(); //消耗回车
            if (clientSocket.isConnected()) {
            } else {
                InetAddress address = InetAddress.getByName(IP);
                InetSocketAddress socketAddress = new InetSocketAddress(address, port);
                clientSocket.connect(socketAddress);
                InputStream in = clientSocket.getInputStream();  //clientSocket调用getInputStream()返回该套接字的输入流
                OutputStream out = clientSocket.getOutputStream(); //clientSocket调用getOutputStream()返回该套接字的输出流
                inData = new DataInputStream(in);
                outData = new DataOutputStream(out);
                read.setDataInputStream(inData);
                read.setDataOutputStream(outData);
                thread.start();  //启动负责读信息的线程
            }
        } catch (Exception e) {
            System.out.println("服务器已断开" + e);
        }
    }
}

class Read implements Runnable {
    Scanner scanner = new Scanner(System.in);
    DataInputStream in;
    DataOutputStream out;

    public void setDataInputStream(DataInputStream in) {
        this.in = in;
    }

    public void setDataOutputStream(DataOutputStream out) {
        this.out = out;
    }

    public void run() {
        System.out.println("输入账单:");
        String content = scanner.nextLine();
        try {
            out.writeUTF(content);
            String str = in.readUTF();
            System.out.println(str);
            str = in.readUTF();
            System.out.println(str);
            str = in.readUTF();
            System.out.println(str);
        } catch (Exception e) {
        }
    }
}
