package org.xcn.traditional;

import java.io.IOException;
import java.net.Socket;
import java.util.Date;

/**
 * @author: hwofe
 * @Date: 2021/6/19 16:38
 * @Description: IoClient
 **/
public class IoClient {

    public static void main(String[] args) {
        new Thread(() -> {
            try {
                Socket socket = new Socket("127.0.0.1", 8000);
                while (true) {
                    try {
                        socket.getOutputStream().write((new Date() + ": hello world").getBytes());
                        Thread.sleep(2000);
                    } catch (Exception e) {
                    }
                }
            } catch (IOException e) {
                System.err.println("error.......");
            }
        }).start();
    }
}
