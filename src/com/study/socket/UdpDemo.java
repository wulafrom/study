package com.study.socket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

/**
 * @version V1.0
 * @Description:
 * @author: h'mm
 * @date: 2020-10-09 20:18
 */
public class UdpDemo {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void server() throws IOException {
        byte[] b = new byte[1024];
        DatagramPacket dp = new DatagramPacket(b, b.length);
        DatagramSocket ds = new DatagramSocket(8888);
        ds.receive(dp);
        System.out.println(new String(dp.getData(), 0, dp.getLength())
                + " form" + dp.getAddress() + ":" + dp.getPort());

        System.out.println(dp.getAddress());
        System.out.println(dp.getPort());
        System.out.println(new String(dp.getData()).trim());
        System.out.println(dp.getSocketAddress());
    }

    @Test
    public void client() throws IOException {
        byte[] b = "hello".getBytes();
        DatagramPacket dp = new DatagramPacket(b, 0, b.length, new InetSocketAddress("192.168.1.8", 8888));
        DatagramSocket ds = new DatagramSocket();
        ds.send(dp);
    }
}
