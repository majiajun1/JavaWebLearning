package com.Socketlearning;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8080)){
            Socket socket = serverSocket.accept();
            InputStream inputStream = socket.getInputStream();
            FileOutputStream fileOutputStream = new FileOutputStream("net/data.txt");
             byte[] buffer = new byte[1024];  // 缓冲区
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, bytesRead);  // 逐步接收数据并写入文件
            }

            System.out.println("文件接收完毕！");
        }catch (Exception e){
            System.out.println("连接失败");
            e.printStackTrace();
        }
    }
}
