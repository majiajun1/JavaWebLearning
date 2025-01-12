package com.Socketlearning;

import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server3 {
    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(8080)) {    //将服务端创建在端口8080上
            System.out.println("正在等待客户端连接...");
            Socket socket = server.accept();
            System.out.println("客户端已连接，IP地址为：" + socket.getInetAddress().getHostAddress());


            //ready是判断当前流中是否还有可读内容
            OutputStreamWriter writer = new OutputStreamWriter(socket.getOutputStream());
            writer.write("HTTP/1.1 200 Accepted\r\n");   //200是响应码，Http协议规定200为接受请求，400为错误的请求，404为找不到此资源（不止这些，还有很多）
            writer.write("\r\n");   //在请求头写完之后还要进行一次换行，然后写入我们的响应实体（会在浏览器上展示的内容）
            writer.write("lbwnb!");
            writer.flush();
            socket.close(); //你必须显式地调用 socket.close()，以便告诉客户端服务器已经完成了数据的发送，+
            // 连接可以安全地关闭，从而让客户端（浏览器）能够正确地处理响应并显示内容。
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
