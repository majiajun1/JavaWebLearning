package com.Socketlearning;

import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client2 {
    public static void main(String[] args) {

        try(Socket socket = new Socket("localhost", 8080))  // try-with-resources
        {
            FileInputStream fileInputStream=new FileInputStream("D:\\Document\\JavaWebLearning\\src\\a.txt");
            OutputStream outputStream=socket.getOutputStream();
            byte[] buffer = new byte[1024];  // 缓冲区
            int bytesRead;
            while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);  // 逐块发送数据
            }

        }catch(Exception e)
        {
            System.out.println("连接失败");
            e.printStackTrace();
        }
    }
}

