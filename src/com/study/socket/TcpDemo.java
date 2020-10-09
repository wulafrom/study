package com.study.socket;

import org.testng.annotations.Test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @version V1.0
 * @Description:
 * @author: h'mm
 * @date: 2020-10-09 20:41
 */
public class TcpDemo {


    @Test
    public void server() throws IOException {
        ServerSocket ss = new ServerSocket(8888);
        System.out.println("服务器已待机。。。");
        while (true) {
            Socket s = ss.accept();
            if (null != s) {
                System.out.println("客户端已经连接" + s.getLocalAddress().getHostName() + "客户端");
            }
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String msg = null;
            while ((msg = br.readLine()) != null && !msg.trim().equals("EXIT")) {
                System.out.println(msg);
            }
        }
    }

    @Test
    public void client() throws IOException {
        Socket s = new Socket("127.0.0.1", 8888);
        if (null != s) {
            System.out.println("已连接"+s.getLocalAddress().getHostName()+"服务器端");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw =null;
            String msg = null;
            try {
                while (!(msg = br.readLine().trim()).equals("EXIT")){
                    PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
                    printWriter.println(msg);
                    printWriter.flush();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                pw.println("EXIT");
                pw.flush();
                pw.close();
            }
        }
    }
}
