package com.example.demo.test.rpc;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * RPC服务器启动
 * @author luojun
 *
 */
@Component
public class StartUp {

    public static final int port = 9001;

    public static void main(String[] args) {
        new StartUp().exportRpc();
    }

    /**
     * 导出RPC接口
     */
    public void exportRpc() {
        try {
            ServerSocket ss = new ServerSocket(port);
            while(true){
                Socket s = ss.accept();
                if(s!=null){
                    new RpcThread(s).start();
                }
            }
        } catch (IOException e) {
            System.out.println("rpc服务启动失败:"+e.getMessage());
            System.exit(0);
        }
    }
}