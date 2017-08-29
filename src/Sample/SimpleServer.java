/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sample;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author labrpl
 */
public class SimpleServer {
    ServerSocket ss;
    Socket s;
    DataInputStream dis;
    
    public void buatServer() throws IOException {
        ss = new ServerSocket(9000);
    }   
    public void terimaClient() throws IOException {
        System.out.print("Menunggu Client.. => ");
        s = ss.accept();
        System.out.println("Client Terhubung!");
    }   
    public void terimaPesan() throws IOException {
        dis = new DataInputStream(s.getInputStream());
        System.out.print("Pesan yang dikirim client : ");
        String str = new String(dis.readUTF());
        System.out.println(str);
    }    
    public static void main(String[] args) {
        SimpleServer ss = new SimpleServer();
        try {
            ss.buatServer();
            ss.terimaClient();
            ss.terimaPesan();
        } catch (IOException ex) {
            
        }
    }
}
