package com.Socketlearning;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
          try {
          Socket socket = new Socket( );
          socket.connect(new InetSocketAddress("127.0.0.1", 8080),1000);
          Scanner in = new Scanner(System.in);
          socket.setSoTimeout(10000);
          socket.setKeepAlive(true);
          System.out.println("已连接到服务端！");
          OutputStreamWriter writer =
                 new OutputStreamWriter( socket.getOutputStream());
          writer.write(in.nextLine()+"\n");
          writer.flush();
//          writer.close();
          System.out.println("数据已发送");
//          socket.shutdownOutput();
             BufferedReader reader=new BufferedReader(new InputStreamReader
                    (socket.getInputStream()));
            System.out.println(reader.readLine());
          }catch (Exception e){
        System.out.println("服务端连接失败！");
        e.printStackTrace();
    }
    }
}
